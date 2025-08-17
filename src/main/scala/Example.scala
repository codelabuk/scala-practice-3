
@main def avgRating: Unit =
  println(ExampleSc.averageRating)

object ExampleSc {

  case class Rating(googleRating: Option[Int], netflixRating: Option[Int])

  case class Film(name: String, rating: Option[Rating])

  val mulan: Film = Film("Mulan", Some(Rating(Some(2), Some(5))))

  val averageRating = for {
    rating <- mulan.rating
    googleRating <- rating.googleRating
    netflixRating <- rating.netflixRating
    averageRating = (googleRating + netflixRating) / 2
  } yield averageRating
}
