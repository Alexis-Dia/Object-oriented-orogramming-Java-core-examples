package by.bntu.fitr.povt.immutable.case2;

/**
 * @author Alexey Druzik on 25.07.2020
 */
public class Test {
    public static final Integer i1 = 1;

    public static void main(String[] args) {
        Integer i2 = 2;
        System.out.println("i1 = " + i1);

        /*We can't change reference for variable with final-modificator: */
        //i1 = i2;
    }
}
