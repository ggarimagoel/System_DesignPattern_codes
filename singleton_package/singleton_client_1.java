package singleton_package;

public class singleton_client_1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new thread1_SP_1());
        Thread t2 = new Thread(new thread2_SP_1());

        t1.start();
        t2.start();
    
        dbConn db = dbConn.getInstance();
        System.out.println(db);
        t1.join();
        t2.join();
    }
}
