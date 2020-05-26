package by.bntu.fitr.povt.generics.lesson3.case3;

public class Main {

    //About this sitiation author says in 8:30 https://www.youtube.com/watch?v=ns8T7-nI_Ec
    public static void main(String[] args) {

        Camera camera1 = new Camera();
        Camera camera2 = new Camera();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        //Product product1 = new Product();
        //Product product2 = new Product();

        camera1.compareTo(camera2);
        //product1.compareTo(product2);
        camera1.compareTo(phone1);
        phone2.compareTo(phone1);

    }
}
