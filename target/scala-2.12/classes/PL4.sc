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