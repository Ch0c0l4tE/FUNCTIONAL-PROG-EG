class Meters(val m: Double) extends Distance(0, "Meters") {
  val value = m
  override def toString() = "( Meters: " + m + ")"
}