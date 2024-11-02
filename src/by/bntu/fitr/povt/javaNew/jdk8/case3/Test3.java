package by.bntu.fitr.povt.javaNew.jdk8.case3;

import java.util.Optional;

public class Test3 {

    public static void main(String[] args) {
        Optional<String> s = Optional.ofNullable(null);
        System.out.println(s.map(Test3::getOutput));
        System.out.println(s.flatMap(o -> Optional.of(o)));
    }

    static String getOutput(String input) {
        return input == null ? null : "output for " + input;
    }

    static Optional<String> getOutputOpt(String input) {
        return input == null ? Optional.empty() : Optional.of("output for " + input);
    }

}
