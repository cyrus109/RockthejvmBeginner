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
  println(aSecondNovel)
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


class Writer (name: String, surname: String, year: Int=1000)
{
  def fullname () : String = this.name + " " + this.surname
  def getyear() :Int = this.year

}

class Novel(name: String="", release: Int=1000, author: Writer){
  def authorAge() : Int=this.release - author.getyear()
  def isWrittenby(author: Writer) : Boolean = if(this.author.equals(author)) true else false
  def copy(newyear: Int): Novel = new Novel(this.name,newyear,this.author)

}

class Counter(counter:Int){
  def getCounter(): Int = this.counter
  def increment(): Counter = new Counter(this.counter + 1)
  def increment(value: Int): Counter = new Counter(this.counter+value)
  def decrement(): Counter= new Counter(this.counter-1)
  def decrement(value: Int) : Counter = new Counter(this.counter-value)
}

