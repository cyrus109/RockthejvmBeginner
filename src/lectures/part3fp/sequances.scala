package lectures.part3fp

object sequances extends App{

  val aSequance = Seq(1,2,3,4)
  println(aSequance)

  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)
  (1 to 10).foreach(x => println("Hello"))

  val aList= List(1,2,3)
  val prepend = 42 +: aList :+ 89
  println(prepend)
  
}
