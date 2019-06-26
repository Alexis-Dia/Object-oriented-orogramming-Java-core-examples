package by.bntu.fitr.povt.generics.lesson3.case4;

public class Product<T> implements Comparable<Product>{

    private String name = "name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
