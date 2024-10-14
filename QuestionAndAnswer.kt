fun main() {
    val num1 = 1
    var num2 = 2
    num2 = 3
    println("num1 is $num1")
    println("num2 is $num2")
    define(name = "Define")
    call()
    fixerror()
    discount()
    adults()
    salary()
    math()
    useAddFunc()
    userMsg()
}

fun define(name: String){
    println("$name, are you lost")
}

fun call(name: String = "Call"){
    println("$name, are you lost?")
}

/*
 * 2. Fix compile error


fun main() { 
    println("New chat message from a friend'}
}*/

fun fixerror() { 
    println("New chat message from a friend")
}
/*
 * This program informs users about the upcoming promotional sale on a particular item. 
 * It has a string template, which relies on the discountPercentage variable for the percent discount and the item
 * variable for the item on sale. However, there are compilation errors in the code
 * 
 * Can you figure out the root cause of the errors and fix them?
Can you determine the output of this program before you run the code in Kotlin Playground?
 */

fun discount() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}

/*
 * Make it display the expected resullts
 * 
fun adults() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
*/

fun adults() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

/*
 * Make it display the expected resullts
 * 
 * fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
 * */
 
 fun salary() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
 
 /*Implement basic math operations
  * 
  * fun main() {
    val firstNumber = 10
    val secondNumber = 5
    
    println("$firstNumber + $secondNumber = $result")
}

  * 1. fix the error to display 10 + 5 = 15
  * */
  
  fun math() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    
    println("$firstNumber + $secondNumber = $result")
}
  /* make a add() function  that can be reusable
   * 
  
  fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}
*/
  
fun useAddFunc() {
    add(firstNumber = 10,secondNumber = 5,thirdNumber = 8)

	
}

fun add(firstNumber: Int ,secondNumber: Int,thirdNumber: Int){
    val result = firstNumber + secondNumber
    val otherresult = firstNumber + thirdNumber
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $otherresult")

   
    
}

/*
 * write a program that displays a message to users with this message template:
 * There's a new sign-in request on operatingSystem for your Google Account emailId.
 * 
 * implement a function that accepts an operatingSystem parameter and an emailId parameter
 * it should return this string:
 * 
 * There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.
 * */
 
 fun userMsg(){
     println(msg("Chrome OS", "sample@gmail.com."))
 }
 
 fun msg(operatingSystem: String, emailId: String): String{
     return "There's a new sign-in request on $operatingSystem for your Google Account $emailId"
     
 }