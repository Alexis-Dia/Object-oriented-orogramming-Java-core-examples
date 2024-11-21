package by.bntu.fitr.povt.multithreading.volotileSynchronizedAtomic.atomic.example1;

/**
 * Зачем Java ATOMIC, когда есть VOLATILE??? https://www.youtube.com/watch?v=-4o4s0e3UX8
 * В доказательство того, что volotile + synchronized = Atomic, сделай synchronized блок для поточных фукций потоков
 */
public class VolatileExample {

    public volatile int sharedValue = 0;

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 500000; i++) {
                example.sharedValue++;
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable()
        {
            public void run() //Этот метод будет выполняться в побочном потоке
            {
                for (int i = 0; i < 500000; i++) {
                    example.sharedValue++;
                }
            }
        });
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(example.sharedValue);
    }

}
