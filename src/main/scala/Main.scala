
@main def hello: Unit = {
  println("Hello World")
  println(msg)
  println(sum(5,2))
  println(switchOn(switchOn = true))
  println(switchOn(switchOn = false))
  println(switchOn())
  println(product(2,4))
  println(greeting(name = "value"))
  print(greeting())
}

def msg: String = "I was compiled by Scala 3"

def sum(n1: Int, n2: Int) = n1 + n2

def switchOn(switchOn: Boolean = false): String = if switchOn then "light On!" else "Light off"

def product(n1: Int, n2: Int): Int = n1*n2

def greeting(name: String = "key"): String =  s"hi $name"

