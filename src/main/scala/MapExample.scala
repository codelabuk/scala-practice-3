import MapExample.{TicketPrice, getFirstClassTicket, getFirstTicketPrice2}

@main def mapEx: Unit =
  val londonToParis = TicketPrice(100, Some(200))
  val londonToParis1 = TicketPrice(100, None)
  println(getFirstClassTicket(Some(londonToParis)))
  println(getFirstClassTicket(Some(londonToParis1)))
  println(getFirstTicketPrice2(Some(londonToParis)))



object MapExample {
  case class TicketPrice(standardTicketPrice: Int, firstClassTicketPrice: Option[Int])
//
//  def getFirstClassTicket(ticketPrice: Option[TicketPrice]) : Option[Int] =
//    ticketPrice.flatMap(tp => tp.firstClassTicketPrice)

  def getFirstClassTicket(ticketPrice: Option[TicketPrice]): Option[Int] =
    ticketPrice.flatMap( _.firstClassTicketPrice)

  def getFirstTicketPrice2(ticketPrice: Option[TicketPrice]): Option[Int] =
    for
      t <- ticketPrice
      firstClassPrice <- t.firstClassTicketPrice
    yield firstClassPrice
  end getFirstTicketPrice2



}
