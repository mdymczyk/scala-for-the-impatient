import scala.collection.JavaConversions.mapAsScalaMap
import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable.{HashMap => ScalaHashMap}

object JavaToScalaMap extends App {
   var javaMap : JavaHashMap[Int, Int] = new JavaHashMap[Int, Int]()
   javaMap.put(1,1)
   javaMap.put(2,2)
   val scalaMap = javaMap
   scalaMap.foreach(e => println(e))
}
