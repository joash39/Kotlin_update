fun main() {
	val count : Int = 2
    var initial : Int = 1 //changes due to being var
    initial = 2
    println("you have only ${count + initial} names!")
    double()
    string()
    boolean()
    functions()
    println(returnType())
    println(parameter("John"))
    println(two_parameters("Mark", 6))
    println(default_parameter())
    println(default_parameter(name = "Rover"))
    
   
}

fun double() {
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}

fun string() {
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)
}
fun boolean() {
    val notificationsEnabled: Boolean = true
    println(notificationsEnabled)
}

fun functions(){
    val name: String = "John Doe\nI am lost"
    println("my name is $name")
}

fun returnType(): String {
    val hbd = "Happy Birthday, Rover!"
    val other = "You are now five years old!"
    return "$hbd\n$other"
}

fun parameter(name: String): String{
    val birth = "You are $name"
    return "$birth"
}

fun two_parameters(name: String, age: Int): String{
    val birth = "My name is $name"
    val age = "I am $age years old"
    return "$birth\n$age"
}

fun default_parameter(name: String = "Range"): String{
    return "the car name was $name"
}