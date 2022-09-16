private val plus = "+"
private val minus = "-"
private val verLine = "|"
private val space = " "

def bar(cellWidth: Int = 3, cellCount: Int = 3) = {
  (plus + (minus * cellWidth)) * cellCount + plus + eol
}

def cells(cellWidth: Int = 3, cellCount: Int = 3) = {
  (verLine + (space * cellWidth)) * cellCount + verLine + eol
}

val mesh = (bar(3) + cells(3)) * 3 + bar(3)
