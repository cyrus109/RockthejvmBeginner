package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{
  def aFactirial(aNumber: Int): Int=
    if (aNumber <=  1) 1
    else aNumber * aFactirial( aNumber - 1 )

  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if (n<=0) accumulator
    else concatenateTailrec(aString,n-1,aString + accumulator)
  println(concatenateTailrec("Hey",4,""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t<=1) true
      else isPrimeTailrec(t-1, n % t !=0 && isStillPrime)

    isPrimeTailrec(n/2, true)
  }
  println(isPrime(2003))
  println(isPrime(629))

 def aFibonaci(n: Int): Int = {
    @tailrec
    def fiboTailrec(i: Int, last: Int, nexttolast: Int): Int =
    {
      if (i>= n) last
      else fiboTailrec(i+1, last + nexttolast, last)
    }
   if(n<=2) 1
   else fiboTailrec(2,1,1)
  }
 println(aFibonaci(8))


  println(aFactirial(10000))
}
