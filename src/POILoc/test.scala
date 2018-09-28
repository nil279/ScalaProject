package POILoc

object test {

  case class Location(lat: Double, lon: Double)
  trait DistanceCalcular {
    def calculateDistanceInKilometer(userLocation: Location, warehouseLocation: Location): Double
  }
  class DistanceCalculatorImpl extends DistanceCalcular {
    private val AVERAGE_RADIUS_OF_EARTH_KM = 6371
    override def calculateDistanceInKilometer(userLocation: Location, warehouseLocation: Location): Double = {
      val latDistance = Math.toRadians(userLocation.lat - warehouseLocation.lat)
      val lngDistance = Math.toRadians(userLocation.lon - warehouseLocation.lon)
      val sinLat = Math.sin(latDistance / 2)
      val sinLng = Math.sin(lngDistance / 2)
      val a = sinLat * sinLat + (Math.cos(Math.toRadians(userLocation.lat)) * Math.cos(Math.toRadians(warehouseLocation.lat)) * sinLng * sinLng)
      val c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))
      (AVERAGE_RADIUS_OF_EARTH_KM * c).toDouble
    }
  }
  def main(args: Array[String]) {
    println("Say Hello scala Project");
    val ss = new DistanceCalculatorImpl().calculateDistanceInKilometer(Location(51.00750, -114.00400), Location(53.546167, -113.485734))
    println(ss);

  }
}