package lectures.part2oop

object OOBasics extends App {
  val person = new Person("john", 26)
  println(person.x)
  person.greet("Cubbit")
  person.greet()

  val aAuthor=new Writer("stephen","king", 1984)
  val aSecondAuthor = new Writer("JK","Rollins",1986)
  val aNovel = new Novel("Maximum overdrive",1995,aAuthor)
  println(aNovel.authorAge())
  println(aNovel.isWrittenby(aSecondAuthor))
  //var aSecondNovel = new Novel()
  val aSecondNovel = aNovel.copy(2000)
  println(aSecondNovel.name)

  val count = new Counter()
  count.inc.print
  count.inc.inc.inc.print
  count.inc(10).print
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


class Writer (name: String, surname: String, val year: Int=1000)
{
  def fullname : String = name + " " + surname

}

class Novel(val name: String="", release: Int=1000, author: Writer){
  def authorAge() : Int=release - author.year
  //def isWrittenby(author: Writer) : Boolean = if(this.author.equals(author)) true else false
  def isWrittenby(author: Writer) = author == this.author
  def copy(newyear: Int): Novel = new Novel(name,newyear,author)

}
// set val before parameter to void creating getters and setters

class Counter(val counter:Int = 0){
  def inc: Counter = {
    println("Incrementing")
    new Counter(counter + 1) // Immutability: when you need to change a value return a new instance
  }
  def inc(value: Int): Counter = {
    if (value <= 0 ) this
    else inc.inc(value-1)
  }
  def dec: Counter= {
    println("Decrementing")
    new Counter(counter-1)
  }
  def dec(value: Int) : Counter = {
    if (value <= 0) this
    else dec.dec(value-1)
  }

  def print = println(counter)
}

