package TicTacToe
package controller

import model.Field
import model.Stone

case class Controller(field: Field):
  def put(stone: Stone, x: Int, y: Int) = {
    copy(field.put(stone, x, y))
  }
  
  override def toString(): String = field.toString
