// Exercise 1
import java.awt.geom.Ellipse2D

trait RectangleLike {
   self : java.awt.geom.RectangularShape =>

   def grow(x : Int, y : Int) {
      setFrame(getX + 2*x, getY + 2*y, getX - x, getY - y)
   }

   def translate(x : Int, y : Int) {
      setFrame(getX + x, getY + y, getX + getWidth, getY + getHeight)
   }
}

object Rectangle {

   def main(args : Array[String]) {
      val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
      egg.translate(10,-10)
      egg.grow(10,20)
   }
}
