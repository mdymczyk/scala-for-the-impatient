// Exercise 4
import scala.io.Source

object FloatingNumbers {

   def processNumbers(fileName : String) {
      val numbers = Source.fromFile(fileName, "UTF-8").getLines.toArray.map(_.toDouble)
      println("Sum: " + numbers.sum)
      println("Average: " + numbers.sum / numbers.length)
      println("Max: " + numbers.max)
      println("Min: " + numbers.min)
   }

   def main(args : Array[String]) {
      processNumbers("numbers.txt")
   }
}
