package by.bntu.fitr.povt.javaNew.jdk8.case9ConveyorStreams.FlatMapToInt;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;

/**
 * @author Alexey Druzik on 29.09.2020
 * flatMapToInt отличие от flatMap, тем что flatMapToInt возвращает стрим объектов типа Int
 */
public class Main {

    public static void main(String[] args) {
        Collection<String> collection1  = Arrays.asList("1,2,0", "4,5");
        IntStream collection2 = collection1
            .stream()
            .flatMapToInt((p) -> Arrays.asList(p.split(",")).stream().mapToInt(Integer::valueOf));
    }
}
