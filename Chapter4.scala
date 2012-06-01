import scala.collection.JavaConversions.propertiesAsScalaMap
import scala.collection.mutable.LinkedHashMap
import java.util.Calendar
import scala.collection.immutable.SortedMap
import scala.io.Source
import scala.collection.mutable.Map

object Chapter4 {
   // Exercise 1
   def createMapOfGizmos() {
      val gizmos = scala.collection.immutable.Map("iphone 45" -> 2500, "ipad" -> 3000)
	 val discountedGizmos = for((k,v) <- gizmos) yield (k,v*0.9)
   }

   // Exercise 2
   def wordCount(file : String) {
      val wordMap = scala.collection.mutable.Map[String, Int]()
	 for(line <- Source.fromFile(file).getLines()) {
	    if(wordMap.contains(line)) {
	       wordMap(line) += 1
	    } else {
	       wordMap += (line -> 1)
	    }
	 }

      wordMap.foreach(el => println(el._1 + " " + el._2))
   }

   // Exercise 3

   def wordCountImmutable(file : String) {
      val wordMap = Source.fromFile(file).
	 getLines().
	 mkString(" ").split("\\s+").
	 groupBy(x=>x).mapValues(x=>x.length)
	 wordMap.foreach(el => println(el._1 + " " + el._2))
   }

   // Exercise 4
   def wordCountSorted(file : String) {
      val wordMap = SortedMap.empty[String,Int] ++ Source.fromFile(file).
	 getLines().
	 mkString(" ").split("\\s+").
	 groupBy(x=>x).mapValues(x=>x.length)
	 wordMap.foreach(el => println(el._1 + " " + el._2))
   }

   // Exercise 5

   // Exercise 6

   def days() {
      val days = LinkedHashMap("Monday" -> Calendar.MONDAY,
	    "Tuesday" -> Calendar.TUESDAY,
	    "Wednesday" -> Calendar.WEDNESDAY,
	    "Thursday" -> Calendar.THURSDAY,
	    "Friday" -> Calendar.FRIDAY,
	    "Saturday" -> Calendar.SATURDAY,
	    "Sunday" -> Calendar.SUNDAY)
	 days.foreach(el => println(el._1 + " " + el._2))
   }

   // Exercise 7

   def printProperties() {
      val props : scala.collection.Map[String, String] = System.getProperties()
	 val length = props.keys.reduceLeft((a,b) => if(a.length > b.length) a else b).length
	 props.foreach(el => println(el._1.padTo(length, " ").mkString + " | " + el._2))
   }

   // Exercise 8

   def minmax(values : Array[Int]) = {
   	(values.min,values.max)
   }
   
   // Exercise 9

   def lteqgt(values : Array[Int], v : Int) = {
   	(values.count(_ < v), values.count(_ == v), values.count(_ > v))
   }
   
   // Exercise 10
   def zipTest() = {
   	"Hello".zip("World")
   }
}
