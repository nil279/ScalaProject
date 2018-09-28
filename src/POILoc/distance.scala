package POILoc

import math.{ sqrt, pow }

object distance {
  
 /*
_ID, TimeSt,Country,Province,City,Latitude,Longitude
5605392,2017-06-21 03:21:55.770,CA,AB,Calgary,51.00750,-114.00400
5605468,2017-06-21 05:21:55.873,CA,AB,Calgary,51.09295,-114.14324

POIID, Latitude,Longitude
POI1, 53.546167, -113.485734
POI2, 54.546167, -113.485734
POI3,45.521629, -73.566024
POI4,45.224830, -63.232729
 */
  
  case class Point(x: Double, y: Double) { // `val` not needed
  def distance(other: Point): Double =
    sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))
}

val pt1 = Point(1.1, 2.2) // no 'new' needed
println(pt1)  // prints Point(1.1,2,2); toString is auto-generated
val pt2 = Point(1.1, 2.2)
println(pt1 == pt2) // == comes free
pt1.copy(y = 9.9) // returns a new and altered copy of pt1 without modifying pt1
	 
 def main(args:Array[String]){
    println("Say Hello scala Project");
  }
	 
  
}