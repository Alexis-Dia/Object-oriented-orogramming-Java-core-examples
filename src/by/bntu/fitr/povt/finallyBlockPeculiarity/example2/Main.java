package by.bntu.fitr.povt.finallyBlockPeculiarity.example2;

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
            int a = 10/0;
            if (a > 0) return 4;
        } catch(Exception e) {
            return 45; //Особенность в том, что 45 - теряется.
        } finally {
            return 34;
        }
    }
}
