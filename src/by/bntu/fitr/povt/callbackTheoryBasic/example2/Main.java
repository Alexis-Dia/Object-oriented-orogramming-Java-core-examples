package by.bntu.fitr.povt.callbackTheoryBasic.example2;

/**
 * @author Alexey Druzik on 17.12.2020
 * It's example with asynchronous callback
 */
class Main {
    public static void main(String[] args) {
        Divide d = new Divide(3,6);
        d.setOnResult(new OnResult() {
            public void onSuccess(double a, double b) {
                double result = a/b;
                System.out.println(result);
            }
            public void onError(Exception e) {
                System.out.println(e.getMessage());
            }
        });
        d.doDiv();
    }
}
