package lectures.part2oop

object AbstractDataTypes extends App{

  //abstract when you need to have unimplemented methods or fields
  abstract class Animal{
    val creatureType: String
    def eat : Unit
  }
  class Dog extends Animal {
    override val creatureType : String = "canine"
    override def eat : Unit = println("crunch crunch")
  }

}
