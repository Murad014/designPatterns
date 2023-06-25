package singleton;

public class LazySingleton {
    private static volatile LazySingleton lazySingleton;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if(lazySingleton == null) // For Double check
                    lazySingleton = new LazySingleton();
            }
        }

        return lazySingleton;
    }



}
