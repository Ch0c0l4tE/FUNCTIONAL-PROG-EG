class Kilometers(val km: Double) extends Distance(1000, "Kilometers") {
  val value = km
  override def toString() = "( kilometers: " + km + ")"
}
