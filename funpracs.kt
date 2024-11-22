fun main() {
    
    mobileNotification()
    movieTicket()
}

/**
 * Complete the printNotificationSummary() function so that the program prints these lines:
You have 51 notifications.
Your phone is blowing up! You have 99+ notifications.

**/
fun mobileNotification() {
    val morningNotification = 51
    val eveningNotification = 135
    
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}



fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if (numberOfMessages < 100){
        println("You have $numberOfMessages notifications")
    }
    else{
        println("Your phone is blowing up! You have $numberOfMessages notifications")
    }
    
}


/**
 * Complete the ticketPrice() function so that the program prints these lines:

The movie ticket price for a person aged 5 is $15.
The movie ticket price for a person aged 28 is $25.
The movie ticket price for a person aged 87 is $20.**/

fun movieTicket() {
    val child = 5 // 12 or younger
    val adult = 28 // btw 13 and 60
    val senior = 87 // 61 and above
    
    val isMonday = true
    
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    if(age<13)
}