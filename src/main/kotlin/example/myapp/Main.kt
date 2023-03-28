package example.myapp

fun buildAquarium() {
    val aquarium = Aquarium(numberOfFish = 29)
    aquarium.printSize()
    //aquarium6.volume  = 70
    //aquarium6.printSize()
    //println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
//    val aquarium1 = Aquarium()
//    aquarium1.printSize()
//    // default height and length
//    val aquarium2 = Aquarium(width = 25)
//    aquarium2.printSize()
//    // default width
//    val aquarium3 = Aquarium(height = 35, length = 110)
//    aquarium3.printSize()
//    // everything custom
//    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
//    aquarium4.printSize()
//    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
//    myAquarium.printSize()
//    val myTower = TowerTank(diameter = 25, height = 40)
//    myTower.printSize()
}
fun makeFish() {
    val shark = Shark ()
    val pleco = Plecostomus()
    println("Shark : ${shark.color}")
    println("Plecostomus: ${pleco.color}")
}
fun main()
{
//    val shark = Shark()
//    val pleco = Plecostomus()
//    println("Shark: ${shark.color}")
//    shark.eat()
//    println("Plecostomus: ${pleco.color}")
//    pleco.eat()
//    makeFish()
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}
//fun main() {
//    buildAquarium()
//}

// Step 1: Create a constructor
//Width: 20 cm Length: 100 cm Height: 40 cm
//Width: 20 cm Length: 100 cm Height: 60 cm

// Step 2: Add init blocks
//aquarium initializing
//Volume: 80 liters
//Width: 20 cm Length: 100 cm Height: 40 cm
//aquarium initializing
//Volume: 100 liters
//Width: 25 cm Length: 100 cm Height: 40 cm
//aquarium initializing
//Volume: 77 liters
//Width: 20 cm Length: 110 cm Height: 35 cm
//aquarium initializing
//Volume: 96 liters
//Width: 25 cm Length: 110 cm Height: 35 cm

//Step 3: Learn about secondary constructors
//aquarium initializing
//Width: 20 cm Length: 100 cm Height: 31 cm
//Volume: 62 liters

//Step 4: Add a new property getter
//aquarium initializing
//Width: 20 cm Length: 100 cm Height: 31 cm
//Volume: 62 liters

//Step 5: Add a property setter
//aquarium initializing
//Width: 20 cm Length: 100 cm Height: 31 cm
//Volume: 62 liters
//Width: 20 cm Length: 100 cm Height: 35 cm
//Volume: 70 liters

//Step 2: Create an interface
//Shark: grey
//hunt and eat fish
//Plecostomus: gold
//eat algae
//Shark : grey
//Plecostomus: gold
