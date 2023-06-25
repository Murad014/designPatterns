import singleton.EagerSingleton;
import singleton.InitializationHolderSingleton;
import singleton.LazySingleton;

public class Main {
    public static void main(String[] args) {

        /*  Eagle Singleton  */
        EagerSingleton eagerSingleton01 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton02 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton01 == eagerSingleton02); // always true beecause intialize just one in memory (1)
        /*  END - Eagle Singleton  */

        /*  Lazy Singleton  */
        LazySingleton lazySingleton01 = LazySingleton.getInstance();
        LazySingleton lazySingleton02 = LazySingleton.getInstance();
        System.out.println(lazySingleton01 == lazySingleton02); // same as (1)
        /*  END - Lazy Singleton  */

        /*  Holder Initialization  */
        InitializationHolderSingleton initializationHolerSingleton01 = InitializationHolderSingleton.getInstance();
        InitializationHolderSingleton initializationHolerSingleton02 = InitializationHolderSingleton.getInstance();
        System.out.println(initializationHolerSingleton01 == initializationHolerSingleton02); // same as (1)
        /*  END - Holder Initialization  */




    }
}