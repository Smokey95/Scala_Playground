package TicTacToe
package controller

import model.{Field, Stone}
import util.Observable

case class Controller(var field: Field) extends Observable:
  
  def this() =
    this(new Field())
  
  def put(stone: Stone, x: Int, y: Int) = {
    field = field.put(stone, x, y)
    notifyObserver
  }
  
  def update: String =
        field.toString()
  
  override def toString(): String = field.toString
