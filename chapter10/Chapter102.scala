// Exercise 2
import java.awt.geom.Ellipse2D
import java.awt.Point 

class OrderedPoint extends Point with scala.math.Ordered[Point] {
   def compare(that : Point) = {
      if( this.equals(that) ) 0
      else if ((x > that.getX) || (x == that.getX && y > that.getY)) 1
      else -1
   }
}

