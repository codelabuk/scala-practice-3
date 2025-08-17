import Example.TrafficLight.{Green, Red, Yellow}
import Example.*

@main def enumChapter(): Unit = {
  println(drivingSignal2(Green))
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
}