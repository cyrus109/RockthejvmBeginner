package lectures.part3fp

object whatsAFunction extends App{
  //DREAM use functions as first class elements
  //PROBLEM oop

  val doubler = new MyFunction[Int,Int] {
    override def apply(element: Int): Int = element * 2
  }



  println(doubler(2))
  //function types = Function1[A,B]
  val stringtoInt = new Function[String, Int] {
    override def apply(string: String) : Int = string.toInt
  }
  println(stringtoInt("3")+4)
  //Functions Types Function2[A,B,R] == (A,B)=>R

  // All Scala Functions are Objects
  /*
  Exercises
  1 Create  a Function who takes 2 strings and concatenates them
  2 Transform in mylist the myPredicate and myTransform to functions
  3 define a function who takes an int and returns a function who takes an Int and returns a Int
    whats the type of this function and how to do it.
   */
  val StringConcat = new Function2[String, String, String] {
    def apply(v1: String, v2: String): String = v1 + v2
  }

  //Function[Int,Function1[Int,Int]]
  val specialFunction : Function[Int,Function[Int,Int]]= new Function[Int,Function[Int,Int]] {
    override def apply(v1: Int): Function[Int, Int] = new Function[Int,Int]  {
      override def apply(v2: Int): Int = v1 + v2
    }
  }
  println(StringConcat("hello,","you"))

}

class Actions{
  def execute(element: Int):String = ???
}

trait MyFunction[A ,B] {
  def apply(element: A): B
}