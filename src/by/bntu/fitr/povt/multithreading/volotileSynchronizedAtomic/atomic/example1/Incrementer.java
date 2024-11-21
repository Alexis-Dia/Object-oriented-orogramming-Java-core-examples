package by.bntu.fitr.povt.multithreading.volotileSynchronizedAtomic.atomic.example1;

import java.util.concurrent.atomic.AtomicInteger;

public class Incrementer {

    public int increment(int value) {
        for (int i = 0; i < 5000000; i++) {
            value++;
        }
        return value;
    }
}
