public class MultiThreadedSingleton {
    private static MultiThreadedSingleton instance = null;
    private  MultiThreadedSingleton(){

    }

    public static  MultiThreadedSingleton getInstance(){
        if(instance == null){
            synchronized (MultiThreadedSingleton.class){
                if(instance == null){
                    System.out.println("MultiThreadedSingleton is called...");
                    instance = new MultiThreadedSingleton();
                }
            }
        }
        return instance;
    }

}
