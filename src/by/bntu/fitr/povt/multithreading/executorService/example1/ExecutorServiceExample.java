package by.bntu.fitr.povt.multithreading.executorService.example1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    SimpleDateFormat sdf;

    ExecutorServiceExample() {
        sdf = new SimpleDateFormat("HH:mm:ss.S");

        ExecutorService executor;
        executor = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков");
        executor.execute(new MyThread( "Thread.1"));
        executor.execute(new MyThread( "Thread.2"));
        executor.execute(new MyThread( "Thread.3"));
        executor.execute(new MyThread( "Thread.4"));

        executor.shutdown();
        System.out.println("Завершение потоков");
    }
    //-------------------------------------------------
    void printMessage(final String templ)
    {
        String text = sdf.format(new Date())+" : "+templ;
        System.out.println(text);
    }
    //-------------------------------------------------
    class MyThread implements Runnable {
        String name;
        MyThread(String n) {
            name = n;
            new Thread(this);
        }

        public void run() {
            try {
                for(int i = 0; i < 5; i++) {
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.println("Thread = " + this.name +"+" + Thread.currentThread().getName() + "-" + Thread.currentThread().getId() );
                }
                printMessage(name + " completed " + this.name + "+"  + Thread.currentThread().getName() + "-" + Thread.currentThread().getId() );
            } catch (InterruptedException e) {}
        }
    }
    //-------------------------------------------------
    public static void main(String args[])
    {
        new ExecutorServiceExample();
    }
}