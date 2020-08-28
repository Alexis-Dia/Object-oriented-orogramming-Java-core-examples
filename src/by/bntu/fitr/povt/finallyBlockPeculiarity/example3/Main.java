package by.bntu.fitr.povt.finallyBlockPeculiarity.example3;

/**
 * @author Alexey Druzik on 28.08.2020
 */
public class Main {
    public static void main(String[]args) throws Exception {

        int result = new Main().test();
        System.out.println("result = " + result);
    }

    int test() {
        try {
            throw new NullPointerException(); //Особенность в том, что NullPointerException - теряется.
        } finally {
            return 54;
        }
    }
}
