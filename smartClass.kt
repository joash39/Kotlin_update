class SmartDevice(val version: String)/**with parameters**/ {
    // instance of a class
    
    val name = "Android Tv"
    val category = "Entertainment"
    var deviceStatus = "Online"
	fun turnon(){
        println("Smart device is turned on")
    }
    fun turnoff() {
        println("Smart device is turned off")
    }
}

fun main() {
   
    val SmartTvDevice = SmartDevice("v 1.2") //instance of a class
    println("Device name : ${SmartTvDevice.name} /n Version: ${SmartTvDevice.version}")
    SmartTvDevice.turnoff() // class method
    
   
    
}
/**

fun getset() {
	
    var speakerVolume = 2
    set (value) {
        if(value in 1..10){
            field = value
        }
        
    }
}

// To look for error
class lightDevice (val name: String, val category: String) {
    var lightStatus = "online"
    
    constructor(name: String, category: String, lightCode: Int) : this(name, category)
    lightStatus = when (lightCode) {
        0 -> "offline"
        1 -> "online"
        else -> "unknown"
    }
}

**/

