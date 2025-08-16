
@main def chapter1: Unit = {
  println("Hello World")
  println(partAtHome(20, true))
}

def partAtHome(guests: Int, tentAvailable: Boolean): Boolean = if guests < 15 then true
else if tentAvailable && guests < 40 then true
else false