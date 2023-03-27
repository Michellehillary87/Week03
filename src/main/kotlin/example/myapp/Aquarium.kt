package example.myapp

import java.lang.Math.PI
class Aquarium (var length: Int = 100,
                var width: Int = 20,
                var height: Int = 40) {
    fun printSize() {
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
        // 1 liter = 1000 cm ^ 3
        println("Volume: $volume liters")
    }

    init {
        println("aquarium initializing")
    }
//    init {
//        // 1 liter = 1000 cm^3
//        println("Volume: ${width * length * height / 1000} liters")
//    }
    constructor(numberOfFish: Int) : this()
    {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }
    var volume: Int
        get() = width * height * length / 1000 // 1000 cm ^ 3 = 1 liter
        set(value) {
            height = (value * 1000) / (width * length)
        }
}
    // Dimension in cm
    //var width: Int = 20
    //var height: Int = 40
    //var length: Int = 100
    //Hasilnya : Width: 20 cm Length: 100 cm Height: 40 cm