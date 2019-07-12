package lectures.part1basics

object Expressions extends App{
  val x = 1 + 2 // expression
  println(x)
  val aCondition=true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)
  "hello world"
  val someValue = {
    2<3
  }
  val someOtherValue= {
    if(someValue) 239 else 968
    42
  }

}
