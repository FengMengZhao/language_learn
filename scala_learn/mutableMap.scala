import scala.collection.mutable.Map

val treasureMap = Map[Int, String](0 -> "Beginning...")
treasureMap += (1 -> "Go to the island.")
treasureMap += (2 -> "Find big X on the ground.")
treasureMap += (3 -> "Gig.")
println(treasureMap(0))
