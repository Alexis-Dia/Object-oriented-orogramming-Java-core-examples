package by.bntu.fitr.povt.multithreadingCommunication.threadLocal.example3;

/**
 * @author Alexey Druzik on 25.08.2020
 */
public class SomeBuilderDemo2 implements Runnable {

    private Thread thread;
    private SomeBuilder builder;

    public SomeBuilderDemo2(SomeBuilder builder) throws InterruptedException {
        this.builder = builder;
        thread = new Thread(this);
        thread.start();
        thread.join();
    }

    @Override
    public void run() {
        for (int i = 0; i < Math.random() * 10; i++) {
            builder.build();
        }
        System.out.println("My name is " + thread.getName() + " and I built " + builder.getCount() + " things");
    }

}




