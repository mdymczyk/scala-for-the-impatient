// Exercise 5
import java.io.PrintWriter

object PowerComputer {

   def computePowersAndReciprocals(fileName : String) {
      val out = new PrintWriter(fileName)
      val powers = for(i <- 0 to 20) yield math.pow(2,i)
      val longest = powers.map(_.toString).reduceLeft((a,b) => if(a.length > b.length) a else b).length      
      powers.foreach(p => out.println(("%"+longest+".0f\t%f").format(p,1.0/p)))
      out.close()
   }

   def main(args : Array[String]) {
      computePowersAndReciprocals("powers.txt")
   }
}
