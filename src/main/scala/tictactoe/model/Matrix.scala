package TicTacToe
package model

case class Matrix[T](rows: Vector[Vector[T]]):
    
    /* Auxiliary constructor */
    def this(size: Int, filling: T) = {
      this(Vector.tabulate(size, size) { (row, col) => filling})
    }
    
    /* Matrix size */
    val size: Int = rows.size
    
    def cell(row: Int, col: Int): T = {
      rows(row)(col)
    }
    
    def row(row: Int) = {
      rows(row)
    }
    
    /* Method to fill a complete matrix with value T */
    def fill(filling: T): Matrix[T] = {
      copy(Vector.tabulate(size, size) { (row, col) => filling})
    }
    
    def replaceCell(row: Int, col: Int, cell: T): Matrix[T] = {
      copy(rows.updated(row, rows(row).updated(col, cell)))
    }
    