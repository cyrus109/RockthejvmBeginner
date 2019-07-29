package lectures.part2oop

object Objects extends App{
  // SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY ("static")
object Person{  //objects can not have parameters || type + only instance
    // Static class level functionality
    val N_EYES=2
    def Canfly : Boolean = false
    //factory method apply
    def apply(mother: Person, father: Person): Person = new Person("bobbie")
  }
  class Person (val name: String){
    // Instance level functionality
  }

  //COMPANIONS
  println(Person.N_EYES)
  println(Person.Canfly)

  val mary = new Person("Mary")
  val john = new Person("John")

  println(mary == john)
  // SCALA Objects == Singleton Instance
  val bobbie = Person(mary,john)

  //SCALA Applications == Scala object with
  // def main(args: Array[String] : Unit
}
