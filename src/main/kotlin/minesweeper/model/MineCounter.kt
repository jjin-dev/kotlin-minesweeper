package minesweeper.model

class MineCounter {
    fun getMineNumber(position: Int, board: Board): Int {
        var count = 0

        for (point in CardinalPoint.values()) {
            count += plusMine(point, board, board.getRow(position), board.getCol(position))
        }

        return count
    }

    private fun isMine(board: Board, row: Int, col: Int): Boolean {
        if (col < START_POSITION || col >= board.col || row < START_POSITION || row >= board.row) return false

        return board.board[row][col].type == Type.MINE
    }

    private fun plusMine(point: CardinalPoint, board: Board, rowNum: Int, colNum: Int): Int {
        if (isMine(board, rowNum + point.moveSide, colNum + point.moveUpDown)) {
            return MINE_ADD_VALUE
        }
        return MINE_EMPTY_VALUE
    }
}
