import factories.LinuxOperatingSystem;
import factories.OperatingSystem;
import factories.WindowsOperatingSystem;


/*
* Factory : As  the name suggest it is factory where we can create objects.
* since it creates object it falls in creational design pattern
* Factory pattern has two  important elements.
* 1. Interface/Abstract class : This is the base class for which we are making factory i.e; we are
* going to get the object of this type.
*
* 2. Factory Class : This will have nothing but object creation logic.
*/
public class OperatingSystemFactory {
    private OperatingSystemFactory(){

    }

    public static OperatingSystem getOperatingSystemInstance(String type , String version, String architecture){
        switch (type){
            case "Linux" :
                return new LinuxOperatingSystem(version , architecture);
            case "Windows" :
                return new WindowsOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("unknown operating system type ::" + type);
        }
    }

}
