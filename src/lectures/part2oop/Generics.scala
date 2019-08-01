package lectures.part2oop

object Generics extends App{
  //idea of using mylist from exercises to hold other values like string
  class MyList[A]{
    //use the type A
  }

  class myMap[key, value]
  val listofIntegers = new MyList[Int]
  val listofStrings = new MyList[String]
//generic methods
  object MyList{
  def empty[A] : MyList[A] = ???

}
}
