class MiliMeters (val mm: Double) extends Distance(-1000, "Milimeters") {
  val value = mm
  override def toString() = "( Milimeters: " + mm + ")"
}