package TicTacToe
package aview

import controller.Controller
import model.Stone
import util.Observer
import scala.io.StdIn.readLine

class TUI(controller: Controller) extends Observer:
  controller.add(this)
  
  def run = {
    println(controller.field.toString)
    getInputAndPrintLoop()
  }
  
  override def update = ???
  
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
          case '0'  => Stone.O
          case _    => Stone.Empty
        val x = chars(1).toString.toInt
        val y = chars(2).toString.toInt
        controller.put(stone, x, y)
        println(controller.toString)
        getInputAndPrintLoop()
        
  }