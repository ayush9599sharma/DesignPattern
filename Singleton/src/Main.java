import java.io.*;

public class Main {
    public static void main(String[] args) throws NotSerializableException,  Exception {

        LazySingleton lazy = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Object.obj"));
        objectOutputStream.writeObject(lazy);
        objectOutputStream.close();

       ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
       LazySingleton deSerializedLazy =  (LazySingleton) objectInputStream.readObject();
       objectInputStream.close();

        System.out.println("object 2 :: " + deSerializedLazy.hashCode());
        System.out.println("Object 1 :: " + lazy.hashCode());



        SerializableSingleton lazy1 = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("Object1.obj"));
        objectOutputStream1.writeObject(lazy1);
        objectOutputStream1.close();

        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("object1.obj"));
        SerializableSingleton deSerializedLazy1 =  (SerializableSingleton) objectInputStream1.readObject();
        objectInputStream1.close();

        System.out.println("object 2 :: " + deSerializedLazy1.hashCode());
        System.out.println("Object 1 :: " + lazy1.hashCode());



    }

}