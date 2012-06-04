// Exercise 7
import java.awt.Point
class Square(corner : Point, width : Int, height : Int) extends java.awt.Rectangle(corner.x, corner.y, width, height) {
   def this(width : Int, height : Int) {
      this(new Point(0,0), width, height)
   }
   
   def this() {
      this(0, 0)
   }
}
