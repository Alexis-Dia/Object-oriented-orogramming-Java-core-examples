package by.bntu.fitr.povt.generics.lesson3.case2;

public class Main {

    public static void main(String[] args) {

        Camera camera1 = new Camera();
        Camera camera2 = new Camera();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        //Product product1 = new Product();
        //Product product2 = new Product();

        final int i = camera1.compareTo(phone1);
        //product1.compareTo(product2);
        //product1.compareTo(phone1);
        camera1.subCompare(phone1);

        final int i1 = phone1.compareTo(camera1);
        phone1.subCompare(camera1);
        phone2.subCompare(camera2);

        System.out.println(i);
        System.out.println(i1);

    }
}
