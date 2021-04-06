package by.bntu.fitr.povt.multithreading.executorService.example3;

import by.bntu.fitr.povt.multithreading.executorService.example3.system.RejectedExecutionHandlerImpl;
import by.bntu.fitr.povt.multithreading.executorService.example3.system.WorkerThread;

import java.util.concurrent.*;

/**
 * @author Alexey Druzik on 06.04.2021
 */
public class ThreadPoolExecutorExample {

    public static void main(String args[]) throws InterruptedException{
        //RejectedExecutionHandler implementation
        RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
        //Get the ThreadFactory implementation to use
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        //creating the ThreadPoolExecutor
        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(
            4,
            4,
            10,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(2),
            threadFactory,
            rejectionHandler);
        //start the monitoring thread
        //MyMonitorThread monitor = new MyMonitorThread(executorPool, 3);
        //Thread monitorThread = new Thread(monitor);
        //monitorThread.start();
        //submit work to the thread pool
        for(int i=0; i<10; i++){
            executorPool.execute(new WorkerThread("cmd"+i));
        }

        Thread.sleep(30000);
        //shut down the pool
        executorPool.shutdown();
        //shut down the monitor thread
        Thread.sleep(5000);
       // monitor.shutdown();

    }
}
