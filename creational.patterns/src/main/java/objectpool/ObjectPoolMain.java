package objectpool;

import java.sql.SQLOutput;

import static java.lang.Thread.sleep;

public class ObjectPoolMain {
    public static void main(String... args) throws InterruptedException {
        ConnectionPool pool = new ConnectionPool(1000, 1);
        new Thread(getNewRunnable(pool)).start();
        sleep(7000);//wait for instance to expire, just for testing
        new Thread(getNewRunnable(pool)).start();
        new Thread(getNewRunnable(pool)).start();
        new Thread(getNewRunnable(pool)).start();
        new Thread(getNewRunnable(pool)).start();
    }

    private static Runnable getNewRunnable(ConnectionPool pool){
        return new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Connection connection = pool.getConnection();
                        connection.executeSomeAction();
                        pool.releaseConnection(connection);
                        System.out.println(connection.getId()+": released to pool");
                        return;
                    } catch (Exception e) {
                        System.out.println("Object limit reached, waiting 2sec and retrying");
                        try {
                            sleep(2000);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        };
    }
}
