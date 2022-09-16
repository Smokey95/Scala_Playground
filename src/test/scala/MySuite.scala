import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class TicTacToeSpec extends AnyWordSpec:
  "TicTacToe" should {
    "have a bar as String of form '+---+---+---+'" in {
      bar() should be("+---+---+---+" + eol)
    }
    "have cells as String of form '|   |   |   |'" in {
      cells() should be("|   |   |   |" + eol)
    }
  }
