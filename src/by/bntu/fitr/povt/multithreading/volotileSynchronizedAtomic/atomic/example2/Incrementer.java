package by.bntu.fitr.povt.multithreading.volotileSynchronizedAtomic.atomic.example2;

import java.util.concurrent.atomic.AtomicInteger;

public class Incrementer {

    public AtomicInteger increment(AtomicInteger value) {
        for (int i = 0; i < 5000; i++) {
            //value++;
            value.incrementAndGet();
        }
        return value;
    }
}
