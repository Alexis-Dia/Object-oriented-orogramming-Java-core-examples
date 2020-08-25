package by.bntu.fitr.povt.multithreadingCommunication.threadLocal.example2;

/**
 * https://urvanov.ru/2017/04/02/threadlocal-%D0%B2-java/
 * @author Alexey Druzik on 25.08.2020
 */
public class Main {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("fromMainThread beginning: " + threadLocal.get());

        threadLocal.set("threadLocalthreadLocalthreadLocalthreadLocal");
        new Thread(threadLocal, "first_thread");
        new Thread(threadLocal, "second_thread");

        System.out.println("fromMainThread end: " + threadLocal.get());
    }
}