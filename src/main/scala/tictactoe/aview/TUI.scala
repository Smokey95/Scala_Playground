package TicTacToe
package aview

import controller.{Controller}
import model.Stone
import util.Observer
import scala.io.StdIn.readLine

class TUI(var controller: Controller) extends Observer:
  
  controller.add(this)                                                          /* Add current instance to controller */
  println(controller.field.toString())                                          /* Initial Field print (empty) */
  
  def this() = 
    this(new Controller)
  
  def run = {
    getInputAndPrintLoop()
  }
  
  override def update: Unit = 
    println("Field was updated")
    println(controller.update)
  
  def getInputAndPrintLoop(): Unit =
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
          case 'o'  => Stone.O
          case _    => Stone.Empty
        val x = chars(1).toString.toInt
        val y = chars(2).toString.toInt
        controller.put(stone, x, y)
        getInputAndPrintLoop()
        
  }