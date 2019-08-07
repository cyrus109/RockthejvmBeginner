package lectures.part3fp

object AnonymousFunctions extends App{
  //anonymous Functions (LAMBDA)
  val doubler: Int => Int = x => x * 2
  println(doubler(3))

  //multiple params in a lambda
  val adder : ( Int, Int ) => Int = (a: Int, b: Int) => a+b
  println(adder(3,4))

  //no params in LAMBDA
  val justDoSomething : () => Int = () => 3

  //careful
  println(justDoSomething) //function itself
  println(justDoSomething()) // call

  //curly braces with LAMBDA
  val stringToInt = { (str: String) =>
    str.toInt
  }

  //more syntactic sugar
  val incrementer: Int => Int = _ + 1
  val niceradder : (Int, Int ) => Int = _ + _

  val spreader = (x: Int) => (y: Int) => x + y
  println(spreader(3)(5))


}
