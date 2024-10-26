//using modifiers i.e. public, private, protected, internal
/**
*public. Default visibility modifier. Makes the declaration accessible everywhere
*private. Makes the declaration accessible in the same class or source file
*protected. Makes the declaration accessible in subclasses.
* internal. Makes the declaration accessible in the same module

**/
//superclass -> SmartDevice
open class SmartDevice(val name: String, val category: String) {
		
    
    private var deviceStatus = "Online"
    open val deviceType = "Unknown"
    
    open fun turnOn() {
        deviceStatus = "on"
    }
    
    open fun turnOff() {
        deviceStatus = "off"
    }
    
}

// Create a SmartTvDevice subclass that extends the SmartDevice superclass
class SmartTvDevice(deviceName: String, deviceCategory: String) : 
	SmartDevice(name = deviceName, category = deviceCategory){
        // override and val keywords to define a deviceType
        override val deviceType = "Smart Tv"
        
        // In the SmartTvDevice subclass body, add the speakerVolume property that 
        // you created when you learned about the getter and setter functions
        
        var speakerVolume = 2
        protected set(value){
            if(value in 0..100){
                field = value
            }
        }
        
        //Define a channelNumber property assigned to a 1 value with a setter
        // function that specifies a 0..200 range
        
        var channelNumber = 1
        set(value){
            if(value in 0..200){
                field = value
            }
        }
        
        // Define an increaseSpeakerVolume() method that increases the volume and
        //  prints a "Speaker volume increased to $speakerVolume." string
        
        fun increaseVolume() {
            speakerVolume++
            println("Speaker Volume increased to $speakerVolume")
        }
        
        //Add a nextChannel() method that increases the channel number and 
        //prints a "Channel number increased to $channelNumber." string
        
        fun nextChannel() {
            channelNumber++
            println("Channel number increased to $channelNumber")
        }
        
        // turn on and off function
        // 
        // Use the super keyword to call the methods from the SmartDevice class
        // in the SmartTvDevice and SmartLightDevice subclasses
        override fun turnOn() {
            super.turnOn()
            println("$name is turned on. Speaker Volume is set to $speakerVolume and channel number is "
                    + "set to $channelNumber")
        }
        
        override fun turnOff() {
            super.turnOff()
            println("$name is turned off")
        }
    }
    
    
    
    
 // On the line after the SmartTvDevice subclass, 
 // define a SmartLightDevice subclass that extends the SmartDevice superclass
 
 class SmartLightDevice (deviceName: String, deviceCategory: String) : 
		SmartDevice (name = deviceName, category = deviceCategory){
        
        override val deviceType = "Smart Light"
            
        var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
    
    // The override keyword informs the Kotlin runtime 
    // to execute the code enclosed in the method defined in the subclass
    // its positioned before fun i.e overide fun turnOn()
    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name is turned on. The brightness level is $brightnessLevel")
    }
    
    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("SmartLight is turned off")
    }
    
        }
        
//  In between the SmartLightDevice class and main() function, define a SmartHome class
// In the SmartHome class constructor, use the val keyword to create a smartTvDevice 
// property of SmartTvDevice type
class SmartHome(val smartTvDevice : SmartTvDevice,
               val smartLightDevice : SmartLightDevice) {
    //In the body of the SmartHome class, define a turnOnTv()method that calls the turnOn()
    // method on the smartTvDevice property

	var deviceTurnOnCount = 0
	private set 

	
    
    fun turnOnTv() {
	deviceTurnOnCount++
        smartTvDevice.turnOn()
    }
    fun turnOffTv() {
	    deviceTurnOnCount--
        smartTvDevice.turnOff()
    }
    
    fun increaseToVolume() {
        smartTvDevice.increaseVolume()
    }
    
    fun channelToNext(){
        smartTvDevice.nextChannel()
    }
    
    // for smartLight
    
    fun turnOnLight() {
        smartLightDevice.turnOn()
    }
    
    fun turnOffLight() {
        smartLightDevice.turnOff()
    }
    
	fun increaseToBrightness() {
        smartLightDevice.increaseBrightness()
    }
    
   	fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
    
}
        
fun main() {
    var smartDevice: SmartDevice = SmartTvDevice("Android Tv", "Entertainment")
    smartDevice.turnOn()
}        
