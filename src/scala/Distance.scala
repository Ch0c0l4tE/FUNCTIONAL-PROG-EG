
abstract class Distance(val factor: Double, val unit: String) {
  val value : Double
  private def toMeters : Double = value * factor
  def +(other: Distance): Distance = new Meters(this.toMeters + other.toMeters)
  override def toString() = "( Distance: " + value + " meters)"
}