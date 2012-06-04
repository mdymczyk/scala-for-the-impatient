// Exercise 8.4
abstract class Item {
   def price : Double
   def description : String
}

class SimpleItem(val price : Double, val description : String) extends Item

import scala.collection.mutable.ListBuffer
class Bundle {
   var items : ListBuffer[Item] = ListBuffer[Item]()

   def price = items.map(_.price).sum
   
   def description = {
      "Items in the bundle: " + items.map(_.description).mkString(", ")
   }

   def addItem(item : Item) { 
      items.append(item)
   }
}
