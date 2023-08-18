package singleton_package;

public class thread1_SP_1 implements Runnable{
    public dbConn ref;
    public void run(){
    dbConn db1 = dbConn.getInstance();
    this.ref = db1;
        System.out.println(db1);
    }

}
