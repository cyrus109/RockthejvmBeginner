package exercises

abstract class MyList[+A] {
  /*
  head first item in the list
  tail remainder of the list
  isEmpty = boolean
  add(int)= new list with item added
  toString => string representation of the list
   */

  def head : A
  def tail : MyList[A]
  def isEmpty : Boolean
  def add[B >: A](element : B ) : MyList[B]
  //def toString : String = s"$head$tail"
  def printElements : String

  override def toString: String = "[" + printElements + "]"
  def map[B](transformer: MyTransformer[A ,B]) : MyList[B]
  def FlatMap[B](transformer: MyTransformer[A, MyList[B]]) : MyList[B]
  def filter(predicate: MyPredicate[A]): MyList[A]
  //concatenation
  def ++[B >: A](list: MyList[B]) : MyList[B]
}
trait MyPredicate[-T]{
  def test(elem: T): Boolean
}
trait MyTransformer[-A, B]{
  def transform(elem :A) : B
}
case object Empty extends MyList[Nothing]{
  def head : Nothing = throw new NoSuchElementException
  def tail : MyList[Nothing] = throw new NoSuchElementException
  def isEmpty : Boolean = true
  def add[B >: Nothing](element: B) : MyList[B] = new Cons(element, Empty)
  def printElements: String = ""
  def map[B](transformer: MyTransformer[Nothing ,B]) : MyList[B] = Empty
  def FlatMap[B](transformer: MyTransformer[Nothing, MyList[B]]) : MyList[B] = Empty
  def filter(predicate: MyPredicate[Nothing]): MyList[Nothing] = Empty
  def ++[B >: Nothing](list: MyList[B]) : MyList[B] = list
}

case class Cons[+A](h: A, t: MyList[A]) extends MyList[A]{
  def head : A = h
  def tail : MyList[A] = t
  def isEmpty : Boolean = false
  def add[B >: A ](element: B) : MyList[B]= new Cons(element, this)
  def printElements : String =
    if (t.isEmpty) "" + h
    else h + " " + t.printElements
  def map[B](transformer: MyTransformer[A ,B]) : MyList[B] =
    new Cons(transformer.transform(h), t.map(transformer))
  def FlatMap[B](transformer: MyTransformer[A, MyList[B]]) : MyList[B] =
    transformer.transform(h) ++ t.FlatMap(transformer)
  def filter(predicate: MyPredicate[A]): MyList[A] = {
    if (predicate.test(h)) new Cons(h, t.filter(predicate))
    else t.filter(predicate)
  }
  def ++[B >: A](list: MyList[B]) : MyList[B] = new Cons(h , t ++ list)
}

object listTree extends App{
  val listofIntegers : MyList[Int] = new Cons(1, new Cons(2, new Cons(3,Empty)))
  val anotherListofIntegers : MyList[Int] = new Cons(4, new Cons(5, Empty))
  val listofStrings : MyList[String] = new Cons("1", new Cons("2", new Cons("3",Empty)))
  println(listofIntegers.map(new MyTransformer[Int,Int] {
    override def transform(elem: Int) : Int = elem * 2
  }))
  println(listofIntegers.filter(new MyPredicate[Int] {
    override def test(elem: Int): Boolean = elem % 2 == 0
  }).toString)

  println((listofIntegers ++ anotherListofIntegers).toString)
  println(listofIntegers.FlatMap(new MyTransformer[Int, MyList[Int]] {
    override def transform(elem: Int): MyList[Int] = new Cons (elem, new Cons[Int](elem + 1, Empty))
  }).toString)


}
