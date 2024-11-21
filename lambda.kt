fun main() {
    val coin: (Int) -> String = {
        // quantity -> "$quantity quarters"
        "$it quarters"
    }
    
    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }
    
    //  to refer to a function as a value, you need to use the function reference operator (::)
    val trickFun = ::trick
    val trickone = trickOne
    val headFun = headortail(true)
    val tailFun = headortail(false)
    val gift = giftornogift(true, coin)
    val nogift = giftornogift(false, cupcake)
    
    // call the trick() function, but this time
    //  include the parentheses like you'd do when you call any other function
    /**
    trickFun()
    
    // call the trickone variable
    trickone()
    treat()
    // head or tail functions
    headFun()
    tailFun()
    
    **/
    gift()
    nogift()
    
  
    
}

fun trick() {
    println("No tricks")
}



// Rewrite the trick() function with a lambda expression
// Use functions as a data type
val trickOne: () -> Unit = {
    println("No tricks!")
}

val treat: () -> Unit = {
    println("No treat!!!")
}

// Use a function as a return type
 
fun headortail(isHead: Boolean): () -> Unit{
    if(isHead){
        return head
    }else {
        return tail
    }
    
} 

val head = {
        println("Coin toss = Head")
    }
val tail = {
        println("Coin toss = Tail")
    }

// Pass a function to another function as an argument

fun giftornogift(isGift: Boolean, extraGift: (Int) -> String): () -> Unit {
    // extraTreat: ((Int) -> String)?) making extraTreat as null  
  if(isGift){
      println(extraGift(5))
      return gift
  }else {
      return nogift
  }
}

val gift = {
    println("Gift available")
}

val nogift = {
    println("No Gift")
}
