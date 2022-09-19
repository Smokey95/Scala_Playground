import utility._

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class UtilitySpec extends AnyWordSpec:
  "Utility" should {
    "have a message String of form 'Hello World!'" in
    {
        helloWorld should be ("Hello World!")
    }
    "have a scalable line with '-' elements" in
    {
        line() should be ("-" * 80)
        line(1) should be ("-")
        line(10) should be ("-" * 10)
    }
    "have a print test which prints the Scala Version" in
    {
        printTest should be ("Hello World!" + eol + "I was compiled by Scala 3.! :)")
    }
  }