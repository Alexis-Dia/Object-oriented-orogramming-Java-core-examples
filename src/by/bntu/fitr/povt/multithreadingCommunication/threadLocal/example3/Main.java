package by.bntu.fitr.povt.multithreadingCommunication.threadLocal.example3;

/**
 * https://samolisov.blogspot.com/2011/04/threadlocal.html
 * @author Alexey Druzik on 25.08.2020
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        SomeBuilder builder = new SomeBuilder();
        new SomeBuilderDemo2(builder);
        new SomeBuilderDemo2(builder);

    }
}