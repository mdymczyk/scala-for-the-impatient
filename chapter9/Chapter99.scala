// Exercise 9
import java.io.File 

object ClassCounter {

   def count(dir : File) : Int = {
      var counter = 0;
      dir.listFiles.filter(!_.isDirectory).filter(_.getName.endsWith(".class")).foreach(_ => counter += 1)
      dir.listFiles.filter(_.isDirectory).foreach(counter += count(_))
      counter
   }

   def main(args : Array[String]) {
      println(count(new File("classes")))
   }
}
