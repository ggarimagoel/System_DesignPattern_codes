package singleton_package;

public class thread2_SP_1 implements Runnable {

        public dbConn ref;
        public void run(){
            dbConn db2 = dbConn.getInstance();
            this.ref = db2;
            System.out.println(db2);
    }
}
