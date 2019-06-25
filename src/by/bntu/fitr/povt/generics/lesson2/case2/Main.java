package by.bntu.fitr.povt.generics.lesson2.case2;

public class Main {

    public static void main(String[] args) {

        Container<Product> c1 = new Container();
        c1.setItem(new Phone());
        c1.setItem(new Camera());

        Product p = c1.getItem();

        Container<String> c2 = new Container();
        c2.setItem(new String("Hello!"));

    }

}
