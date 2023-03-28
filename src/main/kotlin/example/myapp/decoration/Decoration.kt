package example.myapp.decoration


fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)
    val decoration2 = Decoration("slate")
    println(decoration2)
    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))

}

val decoration: Any
val rock = decoration.rock
val wood = decoration.wood
val driver = decoration.driver
val (rock, wood, driver) = decoration