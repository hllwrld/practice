package com.hllwrld.javatest;

class ConnectionPool {
/*

    class Connection {
        public void doJob() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("doJob at thread --" + Thread.currentThread().getName());
        }

    }

    List<Connection> mConnectionList = new LinkedList<>();


    public ConnectionPool() {
        for (int i = 0; i < 20; i++) {
            mConnectionList.add(new Connection());
        }
    }

    public int size() {
        return mConnectionList.size();
    }

    public Connection remove(int index) {
        return mConnectionList.remove(index);
    }

    public void add(Connection connection) {
        mConnectionList.add(connection);
    }


    public Connection fetchConnection() {
        synchronized (mConnectionPool) {
            while (mConnectionPool.size() == 0) {
                try {
                    System.out.println("wait-----" + Thread.currentThread().getName());
                    mConnectionPool.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("get-----" + Thread.currentThread().getName());
        }

    }

    public void releaseConnection() {

    }


    static class WorkerRunnable implements Runnable {

        final private ConnectionPool mConnectionPool;
        private String mName;

        public WorkerRunnable(ConnectionPool connectionPool, String name) {
            mConnectionPool = connectionPool;
            mName = name;
        }

        @Override
        public void run() {
            Thread.currentThread().setName(mName);
            Connection connection = null;
            synchronized (mConnectionPool) {
                connection = mConnectionPool.remove(0);
            }
                connection.doJob();
            synchronized (mConnectionPool) {
                mConnectionPool.add(connection);
                mConnectionPool.notifyAll();
            }
        }
    }


    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();
        for (int i = 0; i < 100; i++) {
            WorkerRunnable workerRunnable = new WorkerRunnable(connectionPool, "Thread-" + i);
            Thread thread = new Thread(workerRunnable);
            thread.start();
        }


    }



 */
}
