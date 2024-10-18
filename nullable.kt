fun main() {
   nullability()
   favActor()
   length()
   elvis()
}

// using nullability

fun nullability(){
    
    var favourite = null
    println(favourite)
    
    //using data type to declare null by adding ?
    var few: String? = "mind games"
    few = null
    println("In declaring data type -> $few")
    
    
    
    // Write a nullable Int value
    var num: Int? = 30
    num = null
    println(num)
    
    var name: String? = "mind games"
    //accessing property
    println(name?.length)
    
    //displays null
    var lead: String? = null
    println(lead?.length)
    
    //brings an error
    //println(lead!!.length)
    
    val namenull: String? = "John Doe"
    val nameLength = if(namenull != null){
        namenull?.length
    }
    else{
        0  
    }
    
    println("The length of the name is $nameLength")
    
  
}

// Assign the favoriteActor variable to the name of your favorite actor
fun favActor() {
    var favoriteActor: String? = "Chris Tucker"

    if (favoriteActor != null) {
      println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
      println("You didn't input a name.")
    }
}

// Create a lengthOfName variable and then assign it to the if/else expression:

fun length() {
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if (favoriteActor != null) {
      println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
      println("You didn't input a name.")
    }
}

// elvis operator
fun elvis() {
    var favoriteActor: String? = null

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}





