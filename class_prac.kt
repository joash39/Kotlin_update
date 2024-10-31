//In the SmartDevice class, define a printDeviceInfo() method that prints a "Device name:
// $name, category: $category, type: $deviceType" string.

class SmartDevice(name: String, category: String) {
    var deviceType = "Android"
    fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }
}

//In the SmartTvDevice class, define a decreaseVolume() method that decreases the volume and
// a previousChannel() method that navigates to the previous channel.

class SmartTvDevice(deviceName: String, deviceCategory: String): 
SmartDevice(name = deviceName, category = deviceCategory){
    override fun decreaseVolume() {
       var volumeLevel = 10 
    }
    override fun previousChannel() {
        
    }
}

// In the SmartLightDevice class, define a decreaseBrightness() method that decreases the brightness
class SmartLightDevice(): 
SmartDevice(name = deviceName, category = deviceCategory) {
    override fun decreaseBrightness() {
        var brightnessLevel = 3
        brightnessLevel--
        println("Brightness Level is : $brightnessLevel")
    }
}

// In the SmartHome class, ensure that all actions can only be performed when each device's deviceStatus 
// property is set to an "on" string. Also, ensure that the deviceTurnOnCount property is 
// updated correctly.

class SmartHome(
	var smartTvDevice: SmartTvDevice,
    var smartLightDevice: SmartLightDevice
) {
    //In the SmartHome class, define an decreaseTvVolume(), changeTvChannelToPrevious(), 
    //printSmartTvInfo(), printSmartLightInfo(), and decreaseLightBrightness() method.
    fun decreaseTvVolume() {
        smartTvDevice.decreaseVolume()
    }
    fun changeTvChannelToPrevious() {
        smartTvDevice.previousChannel()
    }
    
    fun printSmartTvInfo() {
        
    }
    
    fun printSmartLightInfo() {
        
    }
    fun decreaseLightBrightness() {
        smartLightDevice.decreaseBrightness()
    }
    
    
    
}

fun main() {
 
    
    
}