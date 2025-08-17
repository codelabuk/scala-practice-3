import Example.TrafficLight.{Green, Red, Yellow}
import Example.*
import Triathlon.*

@main def enumChapter(): Unit = {
  println(drivingSignal2(Green))
  println(howManyMetres(Cycle))
}


object Example {
  enum TrafficLight:
    case Red, Green, Yellow

  def drivingSignal(signal: TrafficLight): String = {
    if signal == Red then "Stop"
    else if signal == Yellow then "Wait for sometime"
    else "Go"
  }

  def drivingSignal2(signal: TrafficLight): String = signal match {
    case Red => "Stop"
    case Yellow => "Wait for sometime"
    case _ => "Go"
  }

  enum Triathlon(val metres: Int):
    case Swim extends  Triathlon(metres = 400)
    case Cycle extends Triathlon(metres = 5000)
    case Run extends Triathlon(metres = 2500)

  def howManyMetres(tri: Triathlon): Int = tri match {
    case swim @ Swim => swim.metres
    case cycle @ Cycle => cycle.metres
    case run @ Run => run.metres
  }

}

