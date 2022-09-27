package TicTacToe
package aview

import model.Stone
import controller.Controller
import scala.io.StdIn.readLine

class TUI(controller: Controller):
  def run = {
    println(controller.field.toString)
    getInputAndPrintLoop(controller)
  }
  
def getInputAndPrintLoop(controller: Controller): Unit =
{
  val input = readLine
  input match
    case "q" =>
    case _ =>
      val chars = input.toCharArray
      val stone = chars(0) match
        case 'X'  => Stone.X
        case 'x'  => Stone.X 
        case 'O'  => Stone.O
        case '0'  => Stone.O
        case _    => Stone.Empty
      val x = chars(1).toString.toInt
      val y = chars(2).toString.toInt
      val newController = controller.put(stone, x, y)
      println(newController)
      getInputAndPrintLoop(newController)
      
}