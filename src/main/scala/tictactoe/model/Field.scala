package tictactoe.model

import utility.eol                                                              // Import declaration to use eol

case class Field(matrix: Matrix[Stone]):
  
  /* Auxiliary constructor */
  def this(size: Int, filling: Stone) = this(new Matrix(size, filling))
  
  /* Don't wanna use the stings all the time */
  private val plus = "+"
  private val minus = "-"
  private val verLine = "|"
  private val space = " "
  
  val size = matrix.size
  
  def bar(cellWidth: Int = 3, cellCount: Int = 3) = 
  {
    (plus + (minus * cellWidth)) * cellCount + plus + eol
  }
  
  /* Old cell function */
  //def cells(cellWidth: Int = 3, cellCount: Int = 3) = 
  //{
  //  (verLine + (space * cellWidth)) * cellCount + verLine + eol
  //}
  def cells(row: Int, cellWidth: Int = 3) =
  {
    matrix.row(row).map(_.toString).map(" " * ((cellWidth - 1) / 2) + _ + " " * ((cellWidth - 1) / 2)).mkString(verLine, verLine, verLine) + eol
  }
  
  /* Old mesh function */
  //def mesh(cellWidth: Int = 3, cellCount: Int = 3) = 
  //{
  //  (bar(cellWidth, cellCount) + cells(cellWidth, cellCount)) * cellCount + bar(cellWidth, cellCount)
  //}
  def mesh(cellWidth: Int = 3) =
  {
    (0 until size).map(cells(_, cellWidth)).mkString(bar(cellWidth, size), bar(cellWidth, size), bar(cellWidth, size))
  }
  
  /* Return mesh as string representation */
  override def toString(): String = mesh()
  
  def put(stone: Stone, x: Int, y: Int) = 
  {
      copy(matrix.replaceCell(x, y, stone))
  }