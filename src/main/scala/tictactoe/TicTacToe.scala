package TicTacToe

import aview._
import controller._
import model._

import utility.eol
import scala.io.StdIn.readLine

val field = new Field(3, Stone.Empty)

val output = "Welcome to TicTacToe!" + eol + field.toString()

@main def main: Unit = {
  println("Welcome to TicTacToe!")
  val field = new Field(3, Stone.Empty)
  val controller = Controller(field)
  val tui = TUI(controller)
  tui.run
}

