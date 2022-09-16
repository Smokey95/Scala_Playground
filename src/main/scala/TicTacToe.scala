private val plus = "+"
private val minus = "-"
private val verLine = "|"
private val space = " "

def bar(cellWidth: Int = 3, cellCount: Int = 3) = 
{
  (plus + (minus * cellWidth)) * cellCount + plus + eol
}

def cells(cellWidth: Int = 3, cellCount: Int = 3) = 
{
  (verLine + (space * cellWidth)) * cellCount + verLine + eol
}

def mesh(cellWidth: Int = 3, cellCount: Int = 3) = 
{
  (bar(cellWidth, cellCount) + cells(cellWidth, cellCount)) * cellCount + bar(cellWidth, cellCount)
}
val output = "Welcome to TicTacToe!" + eol + mesh()
