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

//------------------------------------------------------------------------------ CoR
type PFRule = PartialFunction[Int, String]

def numberRule(f: Int => Boolean, result: String): PFRule = {
  case n: Int if f(n) => result
}

val GreaterThanFiveRule: PFRule   = numberRule(_ > 5, "Greater than five")
val LessThanFiveRule: PFRule      = numberRule(_ < 5, "Less than five")
def defaultValue(n: Int): String = "This must be magic"

val NumberRulesFn: PFRule =
  GreaterThanFiveRule orElse LessThanFiveRule

def NumberRules(n: Int): String =  NumberRulesFn.applyOrElse(n, defaultValue)

NumberRules(7)
//res0: String = Greater than five
NumberRules(1)
//res1: String = Less than five
NumberRules(5)
//res2: String = This must be magic



