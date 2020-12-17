package by.bntu.fitr.povt.callbackTheoryBasic.example1;

/**
 * @author Alexey Druzik on 17.12.2020
 */
public class Main {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        MyCallback myCallback = new MyCallback();

        //инициализируем колбек, передавая методу registerCallBack экземпляр MyClass, реализующий интерфейс колбек
        someClass.registerCallBack(myCallback);
        someClass.doSomething();

    }
}