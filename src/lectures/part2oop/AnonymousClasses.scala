package lectures.part2oop

object AnonymousClasses extends App{

  abstract class Animal{
    def eat : Unit
  }
  //anonymous class
  val funnyAnimal : Animal = new Animal {
    override def eat : Unit = println("ahahahah")
  }

  /*
  equivant with
  class AnonymousClasses$$anon$1 extends Animal{
  override def eat : Unit = println("ahahahah")
  }
   */
  println(funnyAnimal.getClass)

  class Person(name: String){
    def sayHi : Unit = println(s"Hi, my name is $name, how can i help")
  }
  //anonymous derived classes should have the same parameters as the superclass
  val Jim = new Person("jim"){
    override def sayHi :Unit = println(s"Hi, my name is Jim, how can i be off service")
  }

}
