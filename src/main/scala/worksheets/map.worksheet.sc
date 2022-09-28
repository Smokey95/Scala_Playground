import TicTacToe.model.Stone
import TicTacToe.model.Matrix

val a = List(1, 2, 3, 4, 5)

/* A map takes a function and applied it to every element in a collection */
val b = a.map(x => x + 2)
val c = a.map(b => b * 2)

/* The function will be applied without affecting the original collection */
a
b
c


/* There can also be function defined to use in the map statement */
def add(a: Int) = {
  a + 1
}

a.map(add)

/* Usage of scala functions */
// Take: takes n elements of a collection
val d = a.take(2)
// Last: takes last element of a collection
val e = a.last
// Max and Min work like you would expect it
val f = a.min
val g = a.max


val h = a.map(add).mkString("|")

val i = new Matrix(5, Stone.X)
/* The following map parameter are equal */
i.row(0).map(x => x.toString())
i.row(0).map(_.toString())
/* With following call the vector collection i.row will be mapped to String and then mapped with two leading and ending spaces */
val j = i.row(0).map(_.toString).map(" " * 2 + _ + " " * 2)
/* The mkString can also be applied */
val k = i.row(0).map(_.toString).map(" " * 2 + _ + " " * 2).mkString("|", "|", "|")
val K = i.row(0).map(_.toString).map(" " * 2 + _ + " " * 2).mkString("|")
println(k)
println(K)


val code1 = Vector(Stone.X, Stone.O, Stone.X, Stone.O, Stone.Y)
val code2 = Vector(Stone.X, Stone.X, Stone.Y, Stone.Y, Stone.X)

code1.map(o => o.toString)
code2.map(o => o.toString)

code1.map(o => o.toString).map(o => o.equals(code2.map(o => o.toString())))
code1.map(o => code2.map(x => x.equals(o)))
(code1.toSet diff code2.toSet)
