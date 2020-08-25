package by.bntu.fitr.povt.multithreadingCommunication.threadLocal.example3;

/**
 * @author Alexey Druzik on 25.08.2020
 */
public class BuilderWithoutThreadLocal {

    private int counter;

    public void build() {
        System.out.println("Thread " + Thread.currentThread().getName() + " Build some structure...");
        counter++;
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getCount() {
        return counter;
    }

}
