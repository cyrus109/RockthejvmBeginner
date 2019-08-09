package lectures.part3fp

object MapFlatmapFilter extends App{
  val list = List(1,2,3)
  println(list.head)
  println(list.tail)

  println(list.map(_+1))

  println(list.filter(_%2==0))

  val numbers = List(1,2,3,4)
  val characters = List("a","b","c","d")
  val colors = List("Black", "White")
  val Combinations =  numbers.flatMap(n => characters.flatMap(c => colors.map(color => "" + c + n + "-" + color)))
  println(Combinations)

  val forCombincation = for {
    n <- numbers if n % 2 == 0
    c <- characters
    color <- colors
  }yield "" + c + n + "-for-" + color
  println(forCombincation)
}
