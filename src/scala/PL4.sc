// Exercice 1


class Student private (val firstName: String, val lastName: String, val age: Int) {
  override def toString() = "( FirstName: "+firstName+"; LastName: "+lastName+"; Age:" +age+" )"
}

object Student {
  def apply(firstName: String, lastName: String, age: Int) = {
    new Student(firstName, lastName, if(age < 0 ) 0 else age)
  }

  def apply(fullName: String, age: Int) = {
    val splittedName = fullName.split(" ")
    new Student(splittedName.head, splittedName.last, age)
  }
}

println(Student("teste1", "teste1", 12))
println(Student("teste1", "teste1", -11))
println(Student("joao pedro costa", 25))

abstract class IntTree
case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

def contains(t: IntTree, v: Int): Boolean = t match {
  case EmptyTree                           => false
  case Node(elem, _, _) if (elem == v)     => true
  case Node(elem, left, _) if (elem > v)   => contains(left, v)
  case Node(elem, _, right) if (elem < v)  => contains(right, v)
}

def insert(t: IntTree, v: Int): IntTree = t match {
  case EmptyTree => new Node(v, EmptyTree, EmptyTree)
  case Node(elem, left, right) if (v < elem) => new Node(elem, insert(left, v), right)
  case Node(elem, left, right) => new Node(elem, left, insert(right, v))
}

val tr1 = EmptyTree
val tr2 = insert(tr1, 5)
assert(tr2==Node(5,EmptyTree,EmptyTree))
val tr3 = insert(tr2, 3)
assert(tr3==Node(5,Node(3,EmptyTree,EmptyTree),EmptyTree))
val tr4 = insert(tr3, 7)
assert(tr4==Node(5,Node(3,EmptyTree,EmptyTree),Node(7,EmptyTree,EmptyTree)))
val tr5 = insert(tr4, 4)
assert(tr5==Node(5,Node(3,EmptyTree,Node(4,EmptyTree,EmptyTree)), Node(7,EmptyTree,EmptyTree)))

assert(contains(tr4,4)==false)
println("1")
assert(contains(tr5,5)==true)
println("2")
assert(contains(tr5,7)==true)
println("3")