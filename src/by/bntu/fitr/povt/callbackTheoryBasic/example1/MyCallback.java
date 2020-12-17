package by.bntu.fitr.povt.callbackTheoryBasic.example1;

/**
 * @author Alexey Druzik on 17.12.2020
 */
public class MyCallback implements Callback {

    @Override
    public void callingBack(String s) {

        if (s != null) {
            System.out.println("Ваш ответ: " + s);
        } else {
            System.out.println("Вы не ответили на вопрос!");
        }
    }
}