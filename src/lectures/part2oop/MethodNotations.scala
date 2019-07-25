package lectures.part2oop

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie:String){
    def likes(movie:String):Boolean=movie==favoriteMovie
    def hangOutWith(person: Person):String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"${this.name}, what the heck?"
    def isAlive: Boolean =true
    def apply(): String= s"Hi, my name is $name and my favorite movie is $favoriteMovie"

  }
  val mary = new Person("Mary", "inception")
  println(mary.likes("inception"))
  println(mary likes "inception") //equivalent
  //infix notation = operator notation (only with methods with only 1 parameter)

  //"operators" in scala
  val tom= new Person("Tome", "Fight Club")
  println(mary hangOutWith tom)

  //prefix notations
  //unary operators
  val x = -1
  val y = 1.unary_-
  println(!mary)
  println(mary.unary_!)

  //unary prefix only works with + - ~ !

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) //equivalent

}
