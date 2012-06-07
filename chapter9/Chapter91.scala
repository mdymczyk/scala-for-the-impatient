// Exercise 1
import scala.io.Source
import java.io.PrintWriter

object LineReverser {

   def reverse(fileName : String) {
      val reversed = Source.fromFile(fileName, "UTF-8").getLines.toArray.reverse
      val out = new PrintWriter(fileName)
      reversed.foreach(w => out.println(w))
      out.close()
   }

   def main(args : Array[String]) {
      reverse("test.txt")
      Source.fromFile("test.txt", "UTF-8").getLines.toArray.foreach(w => println(w))
   }
}
