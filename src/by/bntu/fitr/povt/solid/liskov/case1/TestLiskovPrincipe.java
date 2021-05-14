package by.bntu.fitr.povt.solid.liskov.case1;

public class TestLiskovPrincipe {

    /**
     * Here is example of violation of the Liskov-principle, because child CarWrapper throws an
     * exception but parent class DefaultCar - doesn't:
     * */
    public static void main(String[] args) {
        Car car = new NCar();
        CarWrapper carWrapper = new CarWrapper();
        carWrapper.go(car);
    }
}
