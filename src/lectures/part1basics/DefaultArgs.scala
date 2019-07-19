package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App{
@tailrec
def trFact(n: Int, acc: Int=1): Int =
  if (n<= 1) acc
  else trFact(n-1, n*acc)


  val fact10=trFact(10,2)
  println(fact10)

  def savePicure(format: String = "jpg", witdth: Int=1920, height: Int=1080): Unit= println("Saving picture")

  savePicure(witdth=800)

}
