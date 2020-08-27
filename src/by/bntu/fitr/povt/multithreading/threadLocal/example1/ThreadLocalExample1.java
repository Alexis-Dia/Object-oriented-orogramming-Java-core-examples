package by.bntu.fitr.povt.multithreading.threadLocal.example1;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author Alexey Druzik on 25.08.2020
 */
public class ThreadLocalExample1 implements Runnable {

    private ThreadLocal<SimpleDateFormat> formatter;
    private String name;
    private Thread thread;

    public ThreadLocalExample1(ThreadLocal<SimpleDateFormat> formatter, String name) throws InterruptedException {
        this.formatter = formatter;
        this.name = name;
        thread = new Thread(this);
        thread.sleep(new Random().nextInt(1000));
        thread.start();

    }

    @Override
    public void run() {
        System.out.println("Thread Name= "+Thread.currentThread().getName()+" default Formatter = "+formatter.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        formatter.set(new SimpleDateFormat());

        System.out.println("Thread Name= "+Thread.currentThread().getName()+" formatter = "+formatter.get().toPattern());
    }
}
