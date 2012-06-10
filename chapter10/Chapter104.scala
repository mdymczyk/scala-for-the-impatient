// Exercise 4

trait Logger {
   def log(msg : String)
}

class CryptoLogger extends Logger  {
   val key = 3

   def log(msg : String) {
      println(msg.map(c => caesar(c)))
   }

   private def caesar(c : Char) = c match {
      case c if c isLower => ('a'+((c-'a'+key)%26)).toChar
      case c if c isUpper => ('A'+((c-'A'+key)%26)).toChar
      case _ => c
   }
}

