import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    public  static  SerializableSingleton instance = null;
    private  SerializableSingleton(){

    }
    public static SerializableSingleton getInstance() {
        if(instance == null){
            instance = new SerializableSingleton();
        }
        return instance;
    }
    // This is the key method which is responsible during de-serialization process by JVM.
    // This method get invoked, and we are  simply returning  already created object.

    protected Object readResolve(){
        return  instance;
    }

}
