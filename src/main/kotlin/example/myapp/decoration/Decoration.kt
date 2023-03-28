package example.myapp.decoration

import example.myapp.Decoration

data class Decoration(val rocks: String) {
}
// Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver:
String){
}
fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)
}
    //    // Assign all properties to variables.
//
//    val decoration = Decoration ("")
//    val (rock: String, wood : String, diver : String) = d5
//    println(decoration)
//    println(rock)
//    println(diver)
//    val (rock, wood, diver) = decoration
//    val rock = decoration.rock
//    val wood = decoration.wood
//    val diver = decoration.diver
//
//    val decoration1 = Decoration("granite")
//    println(decoration1)
//    val decoration2 = Decoration("slate")
//    println(decoration2)
//    val decoration3 = Decoration("slate")
//    println(decoration3)
//
//    println (decoration1 == decoration2)
//    println (decoration3 == (decoration2))
//
//
//}
    class Choice {
        companion object {
            var name: String = "lyric"
            fun showDescription(name: String) = println("My favorite $name")
        }
    }

    fun main() {
        println(Choice.name)
        Choice.showDescription("pick")
        Choice.showDescription("selection")
    }
