package TicTacToe
package model

/*
* Enum declaration for the TicTacToe stones
*/
enum Stone(stringRepresentation: String):
  override def toString(): String = stringRepresentation
  case X extends Stone("X")
  case O extends Stone("O")
  case Empty extends Stone(" ")