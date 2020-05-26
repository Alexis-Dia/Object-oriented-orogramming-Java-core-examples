package by.bntu.fitr.povt.generics.lesson3.case5;

public class Main {

    public static void main(String[] args) {

        Camera camera1 = new Camera();
        Camera camera2 = new Camera();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Product product1 = new Product();
        Product product2 = new Product();

        camera1.compareTo(camera2);
        phone1.compareTo(phone2);
        product1.compareTo(product2);
        camera1.compareTo(phone1);

    }
}
