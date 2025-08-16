@main def chapter2: Unit =
  println("Hello")
  println(weather(true))
  println(weather(false))
  println(greeting("Ada"))
  println(greeting("Adam"))
  println(greeting1("Adam"))
  println(competition(3))
  println(competition(8))

def weather(sunny: Boolean): String = sunny match {
   case true => "yay where are my sunglasses"
   case false => " where is my umbrella"
 }

def greeting(freind: String) :String = freind match {
  case "Ada" => "Hi Ada"
  case "Deji" => "Hi Deji"
  case _ => "Hi what's ur name"
}


def greeting1(friend: String) :String = friend match {
  case "Ada" | "Deji"  => "Hi Friends , Long Time"
  case newFriend => s"Hi $newFriend"
}

def competition(result: Int): String = result match
  case 1 => "Gold"
  case 2 => "Silver"
  case 3 => "Bronze"
  case _ => "Well Done !"