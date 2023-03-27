package example.myapp

import java.lang.Math.PI
fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}
fun main(){
    buildAquarium()
}
//Width: 20 cm Length: 100 cm Height: 40 cm
//Width: 20 cm Length: 100 cm Height: 60 cm