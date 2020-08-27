package by.bntu.fitr.povt.multithreading.threadLocal.example3;

/**
 * @author Alexey Druzik on 25.08.2020
 */
public class BuilderWithThreadLocal {

    private ThreadLocal<Integer> counter = new ThreadLocal<Integer>();

    public void build() {
        System.out.println("Thread " + Thread.currentThread().getName() + " Build some structure...");
        if (counter.get() == null)
            counter.set(0);

        counter.set(counter.get() + 1);
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getCount() {
        return counter.get();
    }

}