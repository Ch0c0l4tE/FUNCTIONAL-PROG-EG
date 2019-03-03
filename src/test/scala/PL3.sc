import scala.annotation.tailrec

val aList:List[Int] = List(1, 2, 3)
val bList=List("edom", "odsoft", "tap")
val cList=List('a', 'b')
val dList=List(true, false)
val e=5.6
val fList = List(1.0, 2, 3)
val g='i'
//a. List[Char] using bList
val flattenList = bList.flatten
//b. List[Int] using bList
bList.map(_.count(x => x == x))
//c. List[Any] using only aList and bList
val anyAandB = aList ::: bList
//d. List[Any] using e
// TODO val usingE =
//e. List[AnyVal] using e
// TODO val usingEToAnyVal =


//What are the expressions to specify in order to obtain List(1, 3, 5, 7, 9) using
//a. List.range
List.range(1,10,1) // last parameter == step
//b. List.tabulate
List.tabulate(9)(_ + 1)


// Create the expressions to obtain List("Joana", "José")
// from List("Maria", "Ana","Joana", "Julia", "Paulo", "José") using
// a. filter
List("Maria", "Ana","Joana", "Julia", "Paulo", "José").filter(_.charAt(0) == 'J')
// b. for… yield
for (elem <- List("Maria", "Ana","Joana", "Julia", "Paulo", "José") if elem.charAt(0) == 'J') yield elem

//4. What should be the value of x to allow the indicated result?
val x = (t: Int) => Math.abs(t)
List(1, 2, 3, -1, -2, -3, 0).map(x)
//> Result: List[Int] = List(1, 2, 3, 1, 2, 3, 0)

//Define the function hasDigit that verifies if what is passed has any digit, without cycles,
//var or val, declarations or recursion. It must work with the test examples provided.
def hasDigit(x : String): Boolean = {
  val pattern = "\\d".r
  //> pattern : scala.util.matching.Regex = ([0-9]+)( +)([A-Za-z]+)
  return pattern.findAllIn(x).count(x => x == x) > 0
}
hasDigit("a9a0 00 00 ad2")


//6. TODO Consider a Scala function max_ to be completed:
def max_(xs: List[Int]): Option[Int] = {
  @tailrec
  def maxAux(m: Int, ys: List[Int]): Option[Int] = ys match {
    case Nil => ???
    case x :: t => ???
  }
  ???
}


//7. TODO Consider these calls:
//  applyF_(List(19, 2, 3),List("aa", "b", "c")) (f1)
//applyF_(List(19, 2, 3),List("aa", "b", "c")) (f2)
//applyF_(List(19, 2, 3),List("aa", "b", "c")) (f3)
//applyF_(List(19, 2, 3),List("aa", "b", "c")) (f4)
//with, respectively, the following results:
//  res41: String = 19aa2b3c
//  res42: String = 1923aabc
//  res43: String = 3219aabc
//  res44: String = 3291aabc
//  Specify the functions, knowing that the first argument list of applyF_should specify two
//  lists of generic types and its result should be a String. The arguments of each of the other
//functions (f1,f2,f3,f4) should be two lists of generic types and their result should be of
//type String.