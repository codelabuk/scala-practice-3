@main def chapter3: Unit = {
  val anne = Person("Anne", 25)
  println(greeting(anne))

  val anne1 = anne.copy(age = 36)
  println(greeting(anne1))
}


def greeting(person: Person) : String = s"hi ${person.name} with ${person.age}"

case class Person(name: String, age: Int)

