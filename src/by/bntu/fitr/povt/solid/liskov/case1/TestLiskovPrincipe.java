package by.bntu.fitr.povt.solid.liskov.case1;

public class TestLiskovPrincipe {

    public static void main(String[] args) {
        Car car = new NCar();
        CarWrapper carWrapper = new CarWrapper();
        carWrapper.go(car);
    }
}
