package by.bntu.fitr.povt.finallyBlockPeculiarity.example1;

/**
 * @author Alexey Druzik on 28.08.2020
 */
public class Main {
    public static void main(String[]args) throws Exception {

        int result = new Main().test();
        System.out.println("result = " + result);
    }

    int test() throws Exception {
        try {
            throw new Exception("a"); //Особенность в том, что Exception("a") - теряется.
        } finally {
            throw new Exception("b");
        }
    }
}
