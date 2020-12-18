package by.bntu.fitr.povt.callbackTheoryBasic.example3;

/**
 * @author Alexey Druzik on 18.12.2020
 * It's example with asynchronous callback
 */
public class Main {
    // Driver Program
    public static void main(String[] args) {

        Divide obj = new Divide(3, 6);
        obj.registerOnGeekEventListener(new OnResult() {
            public void onSuccess(double a, double b) {
                double result = a/b;
                System.out.println(result);
            }
            public void onError(Exception e) {
                System.out.println(e.getMessage());
            }
        });
        obj.doDiv();
    }
}
