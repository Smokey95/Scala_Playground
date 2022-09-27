import scala.collection.Stepper
/*
* Demo of a worksheet in scala. Worksheets can be used to build and directly test project parts.
*/

// Simple addition
1+2
 

// Function are also possible
def f(x: Int) = x + 2
f(10)       

// And also classes
case class Person(name: String, age: Int)
val smokey = Person("Smokey", 69)

val cells = Vector(Vector("X", "O", "X"), Vector(), Vector())
cells(0)(1)

enum Stone:
    case X, O, Empty

/* Without enum constructor like in Stone.scala the Stone has Empty has the String representation "Empty" */
val stoneX = Stone.X
val stoneE = Stone.Empty
    
case class Matrix(rows: Vector[Vector[Stone]]):
    def cell(row: Int, col: Int) = rows(row)(col)
    def fill(filling: Stone): Matrix = copy(Vector.tabulate(3, 3) { (row, col) => filling})
    def replaceCell(row: Int, col: Int, cell: Stone) = copy(rows.updated(row, rows(row).updated(col, cell)))
    
val m = Matrix(Vector(Vector(Stone.X, Stone.O, Stone.X), Vector(), Vector()))
m.cell(0, 2)
val m2 = m.fill(Stone.Empty)
m2.replaceCell(1, 1, Stone.X)
m2.cell(1,1)