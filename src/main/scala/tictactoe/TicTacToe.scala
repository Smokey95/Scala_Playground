package tictactoe

import model._
import utility.eol

val field = new Field(3, Stone.Empty)

val output = "Welcome to TicTacToe!" + eol + field.toString()


def getInputAndPrintLoop(field: Field): Unit =
{
  //val input = readLine
  
}