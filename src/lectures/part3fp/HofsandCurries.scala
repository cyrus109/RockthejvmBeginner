package lectures.part3fp

object HofsandCurries extends App{
  val superFunction : (Int, (String, (Int => Boolean)) => Int) => (Int => Int)= null
  // Higher Order Function (HOF) Function that has a function as a parameter
  // map, flatmap, filter in myList
  //TODO read again this part
  //function that applies a function n times over a value x
  //nTimes(f,n,x)
  //nTimes(f,3,x) = f(f(f(x)))
  def nTimes(f: Int => Int, n: Int, x: Int) : Int =
    if (n <=0 ) x
  else nTimes(f,n-1,f(x))

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne,10,1))

  def nTimesBetter(f: Int => Int , n: Int) : (Int => Int) =
    if (n <=0 ) (x: Int) => x
  else (x: Int) => nTimesBetter(f,n-1)(f(x))

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(4))

  //curried functions
  val spreader: Int => (Int => Int) = (x: Int) => (y: Int) => x + y
  val add3 = spreader(3) // y = 3 + y
  println(add3(10))

  //functions with multiple parameter list
  def curriedFormater (c:String)(x: Double) : String = c.format(x)
  val standardFormat: (Double => String) = curriedFormater("%4.2f")
  val preciseFormat:(Double => String) = curriedFormater("%10.8f")

  println(standardFormat(math.Pi))
  println(preciseFormat(math.Pi))

}
