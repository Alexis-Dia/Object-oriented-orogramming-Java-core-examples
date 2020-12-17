package by.bntu.fitr.povt.callbackTheoryBasic.example1;

import javax.swing.*;

/**
 * @author Alexey Druzik on 17.12.2020
 */
class SomeClass {

    private String replyTo;
    private Callback callback;

    void registerCallBack(Callback callback){
        this.callback = callback;
    }

    void doSomething(){
        int reply = JOptionPane.showConfirmDialog(null, "Вы программист?", "Опрос", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.NO_OPTION){
            replyTo = "Нет";
        }
        if (reply == JOptionPane.YES_OPTION){
            replyTo = "Да";
        }

        callback.callingBack(replyTo);
    }
}
