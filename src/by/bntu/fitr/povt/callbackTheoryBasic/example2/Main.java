package by.bntu.fitr.povt.callbackTheoryBasic.example2;

/**
 * @author Alexey Druzik on 17.12.2020
 */
class Main {
    public static void main(String[] args) {
        Divide d = new Divide(3,0);
        d.setOnResult(new OnResult() {
            public void onSuccess(double a) {
                System.out.println(a);
            }
            public void onError(Exception e) {
                System.out.println(e.getMessage());
            }
        });
        d.doDiv();
    }
}
