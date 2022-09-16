private val msg = "I was compiled by Scala 3.! :)"

private val helloWorld = "Hello World"

val eol = sys.props("line.separator")
val line = "-" * 80

def printTest = helloWorld + eol + msg
