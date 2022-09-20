package tictactoe.model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class MatrixSpec extends AnyWordSpec{
	
  "A Matrix is a tailor made immutable data type contains a two dimensional Vector of something. A Matrix " when {
    "empty" should{
      "be created by using a dimension and a sample cell" in {
				val matrix = new Matrix[String](2, "x")
				matrix.size should be(2)
			}
      "for test purpose only be created with a Vector of Vectors" in {
        val testMatrix = Matrix(Vector(Vector("x")))
        testMatrix.size should be(1)
      }
    }
    "filled" should {
      val matrix = new Matrix[String](2, "x")
      "give access to its cells" in {
        matrix.cell(0,0) should be("x")
        matrix.cell(0,1) should be("x")
        matrix.cell(0,1) should be("x")
        matrix.cell(1,1) should be("x")
      }
      "give access to its rows" in {
        matrix.row(0) should be(Vector("x", "x"))
      }
      "replace cells and returns a new data structure" in {
        val returnedMatrix = matrix.replaceCell(0, 0, "o")
        matrix.cell(0, 0) should be("x")
        returnedMatrix.cell(0, 0) should be("o")
        returnedMatrix.cell(1, 1) should be("x")
      }
      "be filled using fill operation" in {
        val returnedMatrix = matrix.fill("x")                                   // fill matrix with "x"
        var i: Int = returnedMatrix.size - 1                                    // get upper boundary
        while(i != 0)                                                           // test all fields in loop
        {
          returnedMatrix.cell(i, i) should be("x")
          returnedMatrix.cell(i, i - 1) should be("x")
          returnedMatrix.cell(i - 1, i) should be("x")
          i = i - 1
        }
        returnedMatrix.cell(0, 0) should be("x")                                // extra test for pos (0,0)
      }
    }
  }
}