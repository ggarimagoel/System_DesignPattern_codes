package singleton_package;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class dbConn {
    private static dbConn inst = null ;
    private static Lock lock = new ReentrantLock();

    private dbConn(){

    }

    public static dbConn getInstance(){

        if(inst == null){
            lock.lock();
            if(inst == null){
                inst = new dbConn();
            }
            lock.unlock();
        }
        return inst;
    }
}
