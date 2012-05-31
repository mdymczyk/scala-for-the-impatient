import scala.util.Random
import scala.util.Sorting._
import java.util.TimeZone._
import scala.util.Sorting._
import java.awt.datatransfer._
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

object Chapter3 {

	// Exercixe 1
	def generateArrayOfRandomsWithMap(n : Int) = {
	    new Array[Int](n).map(_ => Random.nextInt(n))
	}

	def generateArrayOfRandomsWithYield(n : Int) = {
		for(i <- new Array[Int](n)) yield Random.nextInt(n)
	}

	// Exercise 2
	def swapAdjacent(a : Array[Int]) {
		for(i <- 0 until (a.length-1,2)) {
				val temp = a(i)
				a(i) = a(i+1)
				a(i+1) = temp
		}
	}

	// Exercise 3
	def swapAdjacentYield(a : Array[Int]) : Array[Int] = {
		(for {b <- a.grouped(2); 
					c <- b.reverse} yield c).toArray
	}

	// Exercise 4
	def orderArray(a : Array[Int]) = {
		val left = for(el <- a if el > 0) yield el
		val right = for(el <- a if el <= 0) yield el
		ArrayBuffer() ++= left ++= right toArray
	}

	// Exercise 5
	def average(d : Array[Double]) = d.sum/d.length

	// Exercise 6
	def rearrangeArray(a : Array[Int]) {
		quickSort(a)
		a.reverse
	}

	def rearrangeArrayBuffer(a : ArrayBuffer[Int]) {
		a.sorted(_ > _)
	}

	// Exercise 7
	def removeDuplicates(a : Array[Int]) = {
		a.distinct
	}

	// Exercise 8
	def leaveOnlyOneNegative(a : Array[Int]) {
		val indexes = for (i <- 0 until a.length if a(i) < 0) yield i
		for (j <- (0 until indexes.drop(1)).reverse) a.remove(indexes(j))
	}

	// Exercise 9
	def getAmericanTimeZones = {
		val ids = getAvailableIDs().
							filter(el => el.contains("America")).
							map(el => el.replace("America/",""))
		quickSort(ids)
		ids
	}

	// Exercise 10
	def getNativeImageFlavors : Buffer[String] = {
		val flavors = SystemFlavorMap.getDefaultFlavorMap().
																	asInstanceOf[SystemFlavorMap]
		flavors.getNativesForFlavor(DataFlavor.imageFlavor)
	}

}
