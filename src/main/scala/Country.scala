
import Example1.*
import UnitedKingdom.*

@main def populationCh() : Unit =
  val country = Country("India", 1000)
  println(population(country))
  println(whereAmI(Scotland))


object Example1 {
  def population(country: Country): Int =
    country.population

  case class Country(name: String, population: Int)

  enum UnitedKingdom:
    case England, NorthernIreland, Scotland, Wales

  import UnitedKingdom.*
  val country = England
  if country == Scotland then println("we're in Scotland")

  def whereAmI(country: UnitedKingdom) = country match {
    case England => "we are in England"
    case NorthernIreland => " we are in northern ireland"
    case Scotland => " we are in Scotland"
    case Wales => "Wales"
  }
}