import java.lang.System

object CheckPassword extends App {
   val password = System.console(),readPassword("Password: ")
   if(password.length > 4) {
      System.out.println(System.getProperty("user.name"))
   } else {
      System.err.println("Password not secret!")
   }
}
