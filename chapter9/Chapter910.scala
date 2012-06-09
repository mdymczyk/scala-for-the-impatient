// Exercise 10
import scala.collection.mutable.ArrayBuffer 

@SerialVersionUID(31L)
class Person(val name : String) extends Serializable {
   val friends : ArrayBuffer[Person] = ArrayBuffer[Person]()
}

object Person {
   def main (args : Array[String]) {
      // create people
      val p = new Person("Adam")
      val p2 = new Person("Ted") 
      val p3 = new Person("Jeff")
      p.friends += p2 
      p.friends += p3 
      val people = Array(p,p2,p3)
      
      // save them to a file
      import java.io._
      val out = new ObjectOutputStream(new FileOutputStream("people.obj"))
      out.writeObject(people)
      out.close()

      // load them from a file
      val in = new ObjectInputStream(new FileInputStream("people.obj"))
      val savedPeople = in.readObject().asInstanceOf[Array[Person]]
   
      // check if it the same array
      if( savedPeople(0).friends.size == 2 &&
          savedPeople.size == 3 &&
          savedPeople(0).friends(0).name == "Ted" &&
          savedPeople(0).friends(1).name == "Jeff" )
	 println("Properly saved and loaded!")
      else
	 println("Something went wrong :(")
   }
}
