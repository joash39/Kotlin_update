fun main() {
    ifelse()
  	whencondition()
    whenin()
    whenis()
}

// using if else

fun ifelse(){
      val trafficLight = "Red"
    
    
    if (trafficLight == "Red"){
        println("Stop")
    }
    else{
        println("Go")
    }
}

//using when condition

fun whencondition(){
    val trafficColor = "Green"
    
    when(trafficColor){
        "Red" -> println("Stop")
        "Green" -> println("Go")
        else -> println("invalid traffic color")
    }
    
}

fun whenin(){
    val x = 6
    when(x){
        2,3,5,7 -> println("Its a prime number")
        in 1..10 -> println("its number btw 1 to 10 but not a prime number")
        else -> println("its not a number btw 1 to 10")
    }
}

fun whenis(){
    val x : Any = "none"
    when(x){
        2,3,5,7 -> println("Its a prime number")
        in 1..10 -> println("its number btw 1 to 10 but not a prime number")
        is Int -> println("its an integer number but not btw 1 to 10")
        else -> println("its not an integer")
    }
}