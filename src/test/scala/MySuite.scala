import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class TicTacToeSpec extends AnyWordSpec:
  "TicTacToe" should {
    "have a bar as String of form '+---+---+---+'" in 
    {                                                                           // Test default values: bar
      bar() should be("+---+---+---+" + eol)
    }
    "have a scalable bar" in 
    {                                                                           // Test scalable values
      bar(1,1) should be("+-+" + eol)
      bar(1,2) should be("+-+-+" + eol)
      bar(2,1) should be("+--+" + eol)
      bar(2,2) should be("+--+--+" + eol)
      bar(2,3) should be("+--+--+--+" + eol)
      bar(3,2) should be("+---+---+" + eol)
    }
    "have cells as String of form '|   |   |   |'" in 
    {                                                                           // Test default values: cells
      cells() should be("|   |   |   |" + eol)
    }
    "have a scalable cells" in {                                                // Test scalable values
      cells(1,1) should be("| |" + eol)
      cells(1,2) should be("| | |" + eol)
      cells(2,1) should be("|  |" + eol)
      cells(2,2) should be("|  |  |" + eol)
      cells(2,3) should be("|  |  |  |" + eol)
      cells(3,2) should be("|   |   |" + eol)
    }
    "have a mesh in form " + "+-+" + "| |" + "+-+" in {
      mesh(1,1) should be ("+-+" + eol + "| |" + eol + "+-+" +eol)
    }
  }
