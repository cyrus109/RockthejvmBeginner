package lectures.part2oop

object Inheritance extends App{

  //single class inheritance
  class Animal{
    val creatureType = "wild"
    def eat = {
      println("nomnom")
    }
  }
  class Cat extends Animal{
    def crunch: Unit ={
      println("crunch")
      eat
    }
  }

  val cat = new Cat
  cat.crunch

  //constructors
  class Person(name: String, age: Int){
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idcard: String) extends Person(name)

  //overriding
  class Dog(override val creatureType: String = "K9") extends Animal{
    //override val creatureType: String = "Domestic"
    override def eat = {
      super.eat
      println("Dog Crunch Crunch")
    }
  }
  val doggie = new Dog
  doggie.eat
  println(doggie.creatureType)

  //type substitution (broad polymorphism)
  val unknownAnimal : Animal = new Dog("k9")
  unknownAnimal.eat

  //supper calling method from parent class

  //preventing overrides
  //1 - use final keyword before def
  //2 - use final before class statement in this case extending is not allowed
  //3 - sealed the class, allow extends in this file but prevent extending in other files



}
