// Exercise 1
class Counter {
   private var value = 0
   def increment() { if(value < Int.MaxValue) value += 1}
   def current() = value
}

// Exercise 2
class BankAccount {
   private var balance = 0
   def current = balance
   def deposit(amount : Int) { balance += amount }
   def withdraw(amount : Int) { if(balance - amount >= 0) balance -= amount }
}

// Exercise 3
class Time(val hrs:Int, val min:Int) {
   if(hrs > 23 || hrs < 0) throw new IllegalArgumentException("Wrong hour representation")
   if(min > 59 || min < 0) throw new IllegalArgumentException("Wrong minute representation")
   def before(other : Time) = if(hrs < other.hrs || (hrs == other.hrs && min < other.min)) true else false
}

// Exercise 4
class Time2(private val hrs:Int, private val min:Int) {
   if(hrs > 23 || hrs < 0) throw new IllegalArgumentException("Wrong hour representation")
   if(min > 59 || min < 0) throw new IllegalArgumentException("Wrong minute representation")
   private val time = 60*hrs + min 
   def before(other : Time2) = if(time < other.time) true else false
}

// Exercise 5
import scala.reflect.BeanProperty
class Student(@BeanProperty var name : String, @BeanProperty var id : Long)

// Exercise 6
class Person(var age : Int) {
   if(age < 0) age = 0
}

// Exercise 7
class Person2(fullName : String) {
   val firstName = fullName.split(" ")(0)
   val lastName = fullName.split(" ")(1)
}


// Exercise 8
class Car(val manufacturer : String, val model : String, val year : Int = -1, var license : String = "") {
   def this(manufacturer : String, model : String, license : String) {
      this(manufacturer, model, -1, license)
   }
}

// Exercise 10
