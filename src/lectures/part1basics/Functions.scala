package lectures.part1basics

object Functions extends App{

  def aFunction(a: String,b: Int): String =
    a + " " + b

  println(aFunction("Hello",3))

  def aGreeting(aName: String, aAge: Int): Unit = println("Hi, My name is" + aName + " and I am " + aAge + "years old")
  aGreeting("Didier",36)
  def aFactirial(aNumber: Int): Int=
    if (aNumber <=  0) 1
    else aNumber * aFactirial( aNumber -1 )

  println(aFactirial(5))

  def aFibonaci(aNum: Int): Int = {
  if (aNum <= 2) 1
    else
    aFibonaci(aNum - 1 ) + aFibonaci(aNum - 2)
  }
println(aFibonaci(8))
  //def aPrime (aNum: Int): Boolean={
    //if (aNum%2 || aNum%3 || aNum%5 || aNum%7) true else false
  //}
//if(aPrime(10)) println(aNum + "Is a prime") else println(aNum + "not a prime")
}
