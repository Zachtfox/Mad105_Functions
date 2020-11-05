fun main(){
    println("Enter the number of the shape you are trying to find the area of.")
    println("1 square")
    println("2 rectangle")
    println("3 triangle")
    println("4 circle")
    var num = readLine()!!.toInt()

    when(num){
        1 -> square()
        2 -> rectangle()
        3 -> triangle()
        4 -> circle()
    }

}

fun square(){
    println("The area of a square is: Length squared")
}

fun rectangle(){
    println("The area of a rectangle is: Length * Height")
}

fun triangle(){
    println("The area of a triangle is: .5 * Base * Height")
}

fun circle(){
    println("The area of a circle is: Pi * Radius squared")
}
