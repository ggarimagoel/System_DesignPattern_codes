package singleton_package;

public class singleton_Client_2 {
    public static void main(String[] args) {
    configManager_2  cm1 = configManager_2.getInstance();
    configManager_2  cm2 = configManager_2.getInstance();
         //Ideally this will have to be done using threads bec otherwise both these objects
        // will run on just one thread that is main thread (hence sequentially)

        System.out.println(cm1 == cm2);
        // here ans will be true bec they are refence to the same obj in the heap;

        String config = cm1.getConfig();
        System.out.println(cm1);
        System.out.println(cm2);

        System.out.println("configuration : " + config);
    }
}
