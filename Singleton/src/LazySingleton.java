public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){

    }

    public static  LazySingleton getInstance(){
        if(instance == null){
            instance  = new LazySingleton();
            System.out.println("Singleton Object Created");
        }
        return  instance;
    }


}
