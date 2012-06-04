// Exercise 6
class Point(val x : Double, val y : Double)

abstract class Shape {
   def centerPoint : Point
}

class Rectangle(val topLeft : Point, val bottomRight : Point) extends Shape {
   def centerPoint = {
      new Point((topLeft.x+bottomRight.x)/2 , (topLeft.y+bottomRight.y)/2)
   }
}

class Circle(val centerPoint : Point, val radius : Double)
