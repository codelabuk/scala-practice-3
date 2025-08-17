import ExampleComp.*

@main def hello1: Unit = println(nearByTrips(destinations))

object ExampleComp {
  case class Destination(city: String, journeyTime: Int)
  val destinations = List(
    Destination("London", 30),
    Destination("Oxford", 120),
    Destination("Edinburgh", 420)
  )

  def nearByTrips(destinations: List[Destination]): List[String] =
    for
      destination <- destinations
      if destination.journeyTime < 150
    yield destination.city
  end nearByTrips

}
