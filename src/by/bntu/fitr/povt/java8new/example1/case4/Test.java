package by.bntu.fitr.povt.java8new.example1.case4;

/**
 * Exmples from:
 * https://habr.com/en/post/216431/
 */
public class Test {

    Formula formula1 = (a) -> Integer.valueOf(a);
    Formula formula2 = Integer::valueOf;

    Something something = new Something();
    Formula formula3 = something::startsWith;

    double d1 = formula1.calculate(1);
    double d2 = formula2.calculate(1);
    double d3 = formula3.calculate(1);
}
