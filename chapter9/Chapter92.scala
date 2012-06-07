// Exercise 2
import scala.io.Source
import java.io.PrintWriter

object TabReplacer {

   def replaceTabs(fileName : String, n : Int) {
      val processedLines = Source.fromFile(fileName, "UTF-8").getLines.toArray
      val out = new PrintWriter(fileName)
      processedLines.foreach(l => out.println(l.replace("\t", " "*n)))
      out.close()
   }

   def main(args : Array[String]) {
      replaceTabs("tabsTest.txt",2)
   }
}
