// Exercise 7
import scala.io.Source

object NonFloatingPrinter {

   def print(fileName : String) {
      val floatingPointPattern = """(([+|-]?[0-9]*\.[0-9]+)|([eE][+|-]?[0-9]+))""".r
      Source.fromFile(fileName).
             getLines.
	     mkString(" ").
	     split(" ").
	     filter(token => floatingPointPattern.findFirstIn(token).isEmpty).
	     foreach(token => println(token))
   }

   def main(args : Array[String]) {
      print("nonFloatingPrinter.txt")
   }
}
