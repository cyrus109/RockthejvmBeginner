package lectures.part2oop

object AbstractDataTypes extends App{

  //abstract when you need to have unimplemented methods or fields
  abstract class Animal{
    val creatureType: String = "wild"
    def eat : Unit
  }
  class Dog extends Animal {
    override val creatureType : String = "canine"
    def eat : Unit = println("crunch crunch")
  }
  //Traits

  trait Carnivore{
    def eat(animal: Animal): Unit
    val prefferedMeal : String = "Fresh Meat"
  }
  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType : String = "croc"
    def eat : Unit = println("nomnomnom")
    def eat(animal: Animal) : Unit = println(s"Im a $creatureType and i'm eating a ${animal.creatureType}")
  }
  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //traits vs abstract classes
  //1 traits cannot have constructors parameters
  //2 Multiple traits can be inherited by the same class
  //3 traits == behavior, abstract class == "thing"
}
