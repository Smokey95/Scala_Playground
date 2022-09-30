package TicTacToe
package util

trait Observer:
  def update:Unit
 
  
class Observable:
  var subScribers: Vector[Observer] = Vector()
  
  def add(s:Observer) = {
    subScribers = subScribers.appended(s)
  }
  
  def remove(s:Observer) = {
    subScribers = subScribers.filterNot(o => o == s)
  } 
  
  def notifyObserver = {
    subScribers.foreach(o => o.update)
  }

