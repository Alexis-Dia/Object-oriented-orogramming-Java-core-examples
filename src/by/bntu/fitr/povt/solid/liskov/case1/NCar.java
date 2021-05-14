package by.bntu.fitr.povt.solid.liskov.case1;

public class NCar extends DefaultCar {

    @Override
    public void go() throws NullPointerException {
        System.out.println("go1");
        throw new NullPointerException();
    }
}
