// Exercise 1
object Conversions {

   def inchesToCentimeters(inches : Double) = inches*2.54

   def gallonsToLiters(gallons : Double) = gallons*7.57

   def milesToKilometers(miles : Double) = miles*1.60934

}

// Exercise 2
abstract class UnitConversion {
   def convert(toConvert : Double)
}

object InchesToCentimeters extends UnitConversion {
   override def convert(toConvert : Double) = toConvert*2.54
}

object GallonsToLiters extends UnitConversion {
   override def convert(toConvert : Double) = toConvert*7.57
}

object MilesToKilometers extends UnitConversion {
   override def convert(toConvert : Double) = toConvert*1.60934
}

// Exercise 3
object Origin extends java.awt.Point {
}

// Exercise 4
class Point(var x : Int, var y : Int)

object Point {
   def apply(x:Int, y:Int) = new Point(x,y)
} 
      
// Exercise 5
object ReverseArgs extends App {
   for(i <- args.reverse) print(i + " ")
}

// Exercise 6 & 7
object CardSuits extends Enumeration {
   type CardSuit = Value
   val Club = Value("♣")
   val Heart = Value("♥")
   val Diamond = Value("♦")
   val Spade = Value("♠")
   import CardSuits._
   def isRed(suit : CardSuit) = suit == Heart || suit == Diamond

}

// Exercise 8
object RGB extends Enumeration {
   val Red = Value(0xff0000)
   val Magenta = Value(0xff00ff)
   val Blue = Value(0x0000ff)
   val Black = Value(0x000000)
   val Yellow = Value(0xffff00)
   val White = Value(0xffffff)
   val Cyan = Value(0x00ffff)
   val Green = Value(0x00ff00)
}
