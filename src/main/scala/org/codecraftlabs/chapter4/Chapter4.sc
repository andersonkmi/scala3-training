// Exercise 01

val gizmos = Map("item1" -> 10.43, "item2" -> 2.23, "item3" -> 3.45)
val adjustedGizmos = for (k, v) <- gizmos yield (k, v * 1.1)
