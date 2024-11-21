package by.bntu.fitr.povt.multithreading.volotileSynchronizedAtomic.atomic.example2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Зачем Java ATOMIC, когда есть VOLATILE??? https://www.youtube.com/watch?v=-4o4s0e3UX8
 */
public class Test {
    AtomicInteger value = new AtomicInteger(0);
    //static Object object1 = new Object();
    //static Object object2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Incrementer incrementer = new Incrementer();
        Test test = new Test();

        MyThread myThread1 = new MyThread(test, incrementer);
        MyThread myThread2 = new MyThread(test, incrementer);
        myThread1.thread.join();
        myThread2.thread.join();
        System.out.println("test.value = " + test.value);
    }
}
