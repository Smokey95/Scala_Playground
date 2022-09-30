import java.lang.Thread.State
import scala.util.Random

//------------------------------------------------------------------------------ Singleton
object Singleton{
  def singletonFunction = println("I am a singleton")
}

Singleton.singletonFunction
//Same references
val testObject = Singleton                                                      
val testObject2 = Singleton                                                     


//------------------------------------------------------------------------------ Factory

trait Animal {
  /* run = Factory Method */
  def run = println("animal running")
}

private class Dog extends Animal {
  override def run: Unit = println("dog running")
}
private class Cat extends Animal {
  override def run: Unit = println("cat running")
}

object Animal{
  def apply(kind: String) = {
    kind match{
      case "dog" => new Dog()
      case "cat" => new Cat()
    }
  }
}

val dog = Animal("dog")                                                         
val cat = Animal("cat")                                                         
dog.run
cat.run


//------------------------------------------------------------------------------ Strategy
var count = 5

object Context{
  
  var strategy = if (count < 3) strategy1 else strategy2
  
  def strategy1 = println("I am strategy 1")
  
  def strategy2 = println("I am strategy 2")
}

Context.strategy
count = count - 1


//------------------------------------------------------------------------------ State

trait Event

case class OnEvent() extends Event
case class OffEvent() extends Event


object StateContext{
  var state = onState
  def handle(e: Event) = {
    e match{ 
      case on: OnEvent => state = onState
      case off: OffEvent => state = offState
    }
    state
  }
  def onState = println("I am on")
  def offState = println("I am off")
}

StateContext.state
StateContext.handle(OffEvent())
StateContext.handle(OnEvent())
