package singleton;

public class InitializationHolderSingleton {
    private InitializationHolderSingleton(){

    }

    private static class Holder{
        static InitializationHolderSingleton initializationHolerSingleton = new InitializationHolderSingleton();
    }

    public static InitializationHolderSingleton getInstance(){
        return Holder.initializationHolerSingleton;
    }
}
