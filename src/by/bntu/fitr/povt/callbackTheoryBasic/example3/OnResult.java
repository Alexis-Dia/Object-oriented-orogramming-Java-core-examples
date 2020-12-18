package by.bntu.fitr.povt.callbackTheoryBasic.example3;

/**
 * @author Alexey Druzik on 18.12.2020
 */
interface OnResult {

    void onSuccess(double a, double b);
    void onError(Exception e);
}
