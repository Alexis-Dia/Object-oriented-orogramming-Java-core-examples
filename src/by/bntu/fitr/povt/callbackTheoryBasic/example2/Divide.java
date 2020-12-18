package by.bntu.fitr.povt.callbackTheoryBasic.example2;

/**
 * @author Alexey Druzik on 17.12.2020
 */
class Divide {
    private OnResult onResult;
    private double a,b;
    Divide(double a, double b) {
        this.a = a;
        this.b = b;
    }
    void doDiv() {
        if (b == 0) {
            onResult.onError(new Exception("Divide by zero"));
            return;
        }
        onResult.onSuccess(a, b);
    }
    void setOnResult(OnResult onResult) {
        this.onResult = onResult;
    }
}
