package minesweeper.model

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MineSweeperMakerTest {
    @Test
    fun `Unit Test`() {
        val candidate = (1..10).toMutableList()

        Assertions.assertThat(candidate.size).isEqualTo(10)
        candidate.remove(8)
        Assertions.assertThat(candidate).isEqualTo(9)
    }
}
