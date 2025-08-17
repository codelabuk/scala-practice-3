@main def chapter3: Unit = {
  val anne = Person("Anne", 25)
  println(greeting1(anne))

  val anne1 = anne.copy(age = 36)
  println(greeting1(anne1))
}


def greeting1(person: Person) : String = s"hi ${person.name} with ${person.age}"

case class Person(name: String, age: Int)

