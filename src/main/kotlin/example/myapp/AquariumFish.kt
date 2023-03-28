package example.myapp

class Shark: FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}
//class Plecostomus: FishAction, FishColor by GoldColor{
//    //override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}
class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("Eat algae"),
    FishColor by fishColor{ //fishColor
    override fun eat() {
        println("eat algae")
    }
}
class PrintingFishAction(val food : String) : FishAction {
    override fun eat (){
        println(food)
    }
}
interface FishAction{
    fun eat()
}
interface FishColor {
    val color: String
}
abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() = println("yum")
    }
object GoldColor : FishColor {
    override val color = "gold"
}
//Shark: grey
//hunt and eat fish
//Plecostomus: gold
//eat algae
//Shark : grey
//Plecostomus: gold
data class Decoration(val rocks: String) {
}


//object GoldColor : FishColor {
//    override val color = "gold"
//}
enum class Color (val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}
enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
    }
//Hasilnya
//EAST
//2
//90