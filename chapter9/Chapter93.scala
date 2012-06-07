// Exercise 3
import scala.io.Source

object ConsolePrinter {

   def printLongWords(fileName : String) {
      Source.fromFile(fileName).getLines.toArray.filter(_.length > 12).foreach(println(_))
   }

   def main(args : Array[String]) {
      printLongWords("longWords.txt")
   }
}
