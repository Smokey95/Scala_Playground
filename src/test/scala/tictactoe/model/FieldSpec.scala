package TicTacToe
package model

import utility._

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class FieldSpec extends AnyWordSpec{
  
  "A Field" should {
    "have a bar as String of form '+---+---+---+'" in {                         // Test default values: bar
      val field = new Field(3, Stone.Empty)
      field.bar() should be("+---+---+---+" + eol)
    }
    //"have a scalable bar" in 
    //{                                                                           // Test scalable values
    //  field.bar(1,1) should be("+-+" + eol)
    //  field.bar(1,2) should be("+-+-+" + eol)
    //  field.bar(2,1) should be("+--+" + eol)
    //  field.bar(2,2) should be("+--+--+" + eol)
    //  field.bar(2,3) should be("+--+--+--+" + eol)
    //  field.bar(3,2) should be("+---+---+" + eol)
    //}
    //"have cells as String of form '|   |   |   |'" in 
    //{                                                                           // Test default values: cells
    //  cells() should be("|   |   |   |" + eol)
    //}
    //"have a scalable cells" in {                                                // Test scalable values
    //  cells(1,1) should be("| |" + eol)
    //  cells(1,2) should be("| | |" + eol)
    //  cells(2,1) should be("|  |" + eol)
    //  cells(2,2) should be("|  |  |" + eol)
    //  cells(2,3) should be("|  |  |  |" + eol)
    //  cells(3,2) should be("|   |   |" + eol)
    //}
    //"have a mesh in form " + "+-+" + "| |" + "+-+" in {
    //  mesh(1,1) should be ("+-+" + eol + "| |" + eol + "+-+" +eol)
    //}
  }
}