fun main() {
    /** 
    val coin: (Int) -> String = {
        // quantity -> "$quantity quarters"
        "$it quarters"
    }
    **/
    
    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }
    
    //  to refer to a function as a value, you need to use the function reference operator (::)

    // using lambda
    val gift = giftornogift(true, {"$it quarters"})
    
    val nogift = giftornogift(false, cupcake)
    
	repeat(4){
        gift()
    }
    
    nogift()
    
    //using repeat
    
  
    
}




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