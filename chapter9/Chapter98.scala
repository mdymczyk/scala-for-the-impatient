// Exercise 8
import scala.io.Source

object ImageSrcFinder {

   def find(fileName : String) {
      val imgRegexp = """(<img\s+src\s*=\s*['|"])([^'|"]+)""".r
      for(imgRegexp(item, src) <- imgRegexp.findAllIn(Source.fromFile(fileName).getLines.mkString)) {
	 println(src)
      }
   }

   def main(args : Array[String]) {
      find("imgSrc.html")
   }
}
