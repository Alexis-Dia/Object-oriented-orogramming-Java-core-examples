package by.bntu.fitr.povt.multithreading.threadLocal.example2;

/**
 * Для чего можно использовать ThreadLocal  в Java:
 *  Хранение информации о пользователе и его правах доступа, что позволит не передавать её в качестве аргумента в каждый класс или метод.
 *  Можно использовать ThreadLocal  для кеширования непотокобезопасных ресурсов вроде SimpleDateFormat.
 *  Различные счётчики обращений для потоков.
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