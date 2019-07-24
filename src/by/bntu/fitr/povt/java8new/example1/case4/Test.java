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

}
