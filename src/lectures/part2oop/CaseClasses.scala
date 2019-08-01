package lectures.part2oop

object CaseClasses extends App{
  /*
  equals, hashcode, toString
   */
  case class Person(name: String, age: Int)

  //1 class parameters are fields
  val jim = new Person("jim", 34)
  println(jim.age)

  //2 sensible to String
  //println(instance) = println(instance.toString) //syntactic sugar
  println(jim.toString)
  //3 equals and hashcode implemented OOTB
  val jim2 = new Person("jim", 34)
  println(jim == jim2)

  //4 case classes have handy copy method
  val jim3 = jim.copy(age=45)
  println(s"name: ${jim3.name} age: ${jim3.age}")

  //5. case classes have companion objects
  val thePerson = Person
  val mary = Person("mary", 31)

  //6 Case classes are serializable
  // messages used with Akka

  //7 Case classes have extractor patterns = can be used in pattern matching

  case object UK{
    def name : String = "The UK of GB and NI"
  }



}
