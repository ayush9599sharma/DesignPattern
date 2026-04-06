public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("Eager Singleton in instantiated");
    }

    public static  EagerSingleton getInstance(){
        return  instance;
    }
}
