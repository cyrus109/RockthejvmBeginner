package lectures.part2oop

object Exceptions extends App{
  val x: String = null
  //println(x.length)
  // this will crash with a nullptr exception
  //1 throwing and catching exceptions

  //val aWierdValue : String= throw new NullPointerException
  // throwable classes extends the throwable class
  //driven from throwable are the classes exception and error

  //2 How to catch exceptions
  def getInt(withExceptions: Boolean) : Int=
    if(withExceptions) throw new RuntimeException
  else 42
  val potentialValue = try{
    // code that might fail
    getInt(true)
  }
  catch{
    case e: RuntimeException => 43

  }finally {
    //code that will get executed no matter what
    //optional
    //does not influence return type
    //use finally only for side effects like log something to a file
    println("finally")
  }
  //3 How to define your own exceptions
  class myExceptions extends Exception
  val exception = new myExceptions
  //throw exception

  /*
  Exercises
  Crash program with out of memory
  crash program with stackoverflowerror
  pocketcalculator
   -add, multiply, divide, substract (x,y)
   throw overflowexception , underflow, math calculation exception, Int.MAX_VALUE or MIN_VALUE , devide by 0

   */
  //OOM
  //val array = Array.ofDim(Int.MaxValue)

  //SO
  def infinite : Int = 1 + infinite
  //val inf: Int =  infinite
  class overFlowException extends RuntimeException
  class underFlowException extends  RuntimeException
  object PocketCalculator {
    def Add (x: Int, y: Int) : Int = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0 ) throw new overFlowException
      else if (x < 0 && y > 0 && result > 0) throw new underFlowException
      else result
    }
  }


}
