package by.bntu.fitr.povt.multithreadingCommunication.threadLocal.example3;

/**
 * Для чего можно использовать ThreadLocal  в Java:
 *  Хранение информации о пользователе и его правах доступа, что позволит не передавать её в качестве аргумента в каждый класс или метод.
 *  Можно использовать ThreadLocal  для кеширования непотокобезопасных ресурсов вроде SimpleDateFormat.
 *  Различные счётчики обращений для потоков.
 * https://samolisov.blogspot.com/2011/04/threadlocal.html
 * @author Alexey Druzik on 25.08.2020
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        BuilderWithThreadLocal builder = new BuilderWithThreadLocal();
        new SomeBuilderDemo(builder);
        new SomeBuilderDemo(builder);

    }
}
