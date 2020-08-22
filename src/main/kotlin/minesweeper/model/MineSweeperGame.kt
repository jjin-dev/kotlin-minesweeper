package minesweeper.model

class MineSweeperGame(board: Board) {
    private var _board: Board = board
    val board: Board
        get() {
            return Board(_board)
        }

    private val maker = MineSweeperMaker()

    constructor(row: Int, col: Int) : this(board = Board(row, col))

    fun generateBoard(mineCount: Int) {
        _board = maker.setMinePosition(_board, mineCount)
        _board = maker.setMineCount(_board)
    }
}
