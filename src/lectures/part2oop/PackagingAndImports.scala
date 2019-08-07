package lectures.part2oop

import playground.{Cinderella => Princess, PrinsCharming}

import java.util.Date
import java.sql.{Date => sqldata}

object PackagingAndImports extends App{
  //package members are accesible with their simple name
val writer = new Writer("Daniel","RocktheJVM", 2018)


  //import the package
  //val princess = new playground.Cinderella
  val princess = new Princess

  //Packages are in hierarchy
  //matching folder structure


  //package object
sayHello
  println(speed_of_light)

  //imports
val prins = new PrinsCharming

  //1 Use FQ name
  val udate = new Date
  //val sqlDate = new sqldata()
  //2 use aliasing


  //defaults imports
  // Java.lang -  String, Objects , Exceptions
  // Scala- Objects, Int , Nothing
  //Scala.PreDef - println, ???
  

}
