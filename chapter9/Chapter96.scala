// Exercise 6
import java.io.PrintWriter

object QuotedStringFinder {

   def findQuotedStrings(string : String) = {
      """"\w+"""".r.findAllIn(string)
   }

   def main(args : Array[String]) {
      findQuotedStrings("""i "like" pie "very" much""").foreach(s => println(s))
   }
}
