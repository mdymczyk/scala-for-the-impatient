// Exercis 3 
package object random { 
   var previous = 0 
      private val a : Int = 1664525 
      private val b : Int = 1013904223 
      private val n : Int = 32 
      def nextInt() : Int = {  
	 previous = previous*a + b%(2*n) 
	 previous 
      } 
   def nextDouble() : Double = { 
      previous = previous*a + b%(2*n) 
      previous 
   }  
   def setSeed(seed : Int) = previous = seed 
} 

package random { 
   object Random {
      def main(args : Array[String]) {
	 random.setSeed(1)
	 println(random.nextInt())
	 println(random.nextDouble()) 
      }
   } 
}

