package by.bntu.fitr.povt.multithreading.volotileSynchronizedAtomic.atomic.example1;

public class MyThread implements Runnable {

    private Test test;
    private Incrementer incrementer;
    public Thread thread;

    public MyThread(Test test, Incrementer incrementer) {
        this.test = test;
        this.incrementer = incrementer;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        //synchronized (incrementer) {
            test.value = incrementer.increment(test.value);
            System.out.println(Thread.currentThread().getName() + ": " + test.value);
        //}
    }
}
