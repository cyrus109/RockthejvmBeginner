package lectures.part2oop

object OOBasics extends App {
  val person = new Person("john", 26)
  println(person.x)
  person.greet("Cubbit")
  person.greet()
}

class Person(name: String, val age: Int=0){
  //Body
  val x=2
  println("class initiated")

  //method
  def greet(name: String) :Unit = println(s"${this.name} says: hi $name")
  //overloading
  def greet(): Unit = println(s"hello i am $name")

  //multiple constructors
  def this(name: String ) = this(name, 0)
  def this() = this("john Doe")
}
