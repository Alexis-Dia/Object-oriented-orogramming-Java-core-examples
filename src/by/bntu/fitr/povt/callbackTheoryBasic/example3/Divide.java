package by.bntu.fitr.povt.callbackTheoryBasic.example3;

/**
 * @author Alexey Druzik on 18.12.2020
 */
class Divide {

    private double a,b;
    private OnResult mListener; // listener field

    Divide(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // setting the listener
    void registerOnGeekEventListener(OnResult mListener)
    {
        this.mListener = mListener;
    }

    // My Asynchronous task
    void doDiv() {

        // An Async task always executes in new thread
        new Thread(new Runnable() {
            public void run() {

                // perform any operation
                System.out.println("Performing operation in Asynchronous Task");

                // check if listener is registered.
                if (mListener != null) {

                    // invoke the callback method of class A
                    mListener.onSuccess(a, b);
                } else {
                    mListener.onError(new Exception("Divide by zero"));
                }
            }
        }).start();
    }

}
