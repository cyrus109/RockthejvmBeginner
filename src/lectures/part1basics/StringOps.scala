package lectures.part1basics

object StringOps extends App{
  val str: String ="Hello, I am learning Scala"

  println(str.substring(7,11))
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)

  //S-interpolator
  val name = "David"
  val age = 12
  val greeting = s"Hi, my name is $name and i wil turn ${age+1} years old"
  println(greeting)

  // F-interpolator
  val speed= 1.2f
  val myth = f"$name can eat $speed%2.2f per minute"
  println(myth)

  //raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
  
}
