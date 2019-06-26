package by.bntu.fitr.povt.generics.lesson3.case5;

public class Product<T extends Product> implements Comparable<T>{

    private String name = "name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
