package lectures.part2oop

object Generics extends App {
  //idea of using mylist from exercises to hold other values like string
  class MyList[+A]{
    //use the type A
    def add[B >: A](element : B) : MyList[B] = ???
  }

  class myMap[key, value]
  val listofIntegers = new MyList[Int]
  val listofStrings = new MyList[String]
//generic methods
  object MyList{
  def empty[A] : MyList[A] = new MyList[A]
}
  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // yes List[cat] extends List[Animal] = covariance
  class ConveriantList[+A]
  val animal : Animal = new Cat
  val animalList : ConveriantList[Animal] = new ConveriantList[Cat]
  //animalList.add(new Dog) ??? Hard question --> we return a list of animals

  //2 NO Invariant list should be same type
  class InvariantList[A]
  val invariantList : InvariantList[Animal] = new InvariantList[Animal]

  //3 Hell, NO! Contravariant
  class ContravariantList[-A]
  val contravariantList : ContravariantList[Cat] = new ContravariantList[Animal] // ???

  // better to understand with
  class Trainer[-A]
  val trainer : Trainer[Cat] = new Trainer[Animal]  // an animal trainer can also train cats

  //bounded Types
  class Cage[A <: Animal](animal : A)  // only accepts subtypes of animal
  val cage = new Cage(new Dog)
  class Car
  //val newCage = new Cage(new Car)



}
