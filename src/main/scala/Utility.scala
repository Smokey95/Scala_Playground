private val msg = "I was compiled by Scala 3.! :)"
val helloWorld = "Hello World!"

val eol = sys.props("line.separator")

/* Line for separation */
def line(length: Int = 80) = "-" * length

def printTest = helloWorld + eol + msg
