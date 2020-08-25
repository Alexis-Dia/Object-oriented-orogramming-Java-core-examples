package by.bntu.fitr.povt.multithreadingCommunication.threadLocal.example2;

/**
 * @author Alexey Druzik on 25.08.2020
 */
class Thread implements Runnable {

    private java.lang.Thread thread;
    private String name;
    private ThreadLocal<String> threadLocal;

    public Thread(ThreadLocal<String> threadLocal, String name) throws InterruptedException {
        this.threadLocal = threadLocal;
        this.name = name;
        thread = new java.lang.Thread(this);
        thread.start();
        thread.join();
    }

    @Override
    public void run() {
        String name = java.lang.Thread.currentThread().getName();
        System.out.println(name + " first threadLocal: " + threadLocal.get());
        threadLocal.set(name + " thread value");
        System.out.println(name + " end threadLocal: " + threadLocal.get());
    }
};