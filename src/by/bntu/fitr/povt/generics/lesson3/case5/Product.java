package by.bntu.fitr.povt.generics.lesson3.case5;

public abstract class Product<T extends Product<T>> implements Comparable<T>{

    private String name = "name";

    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int subCompare(T p);

    @Override
    public int compareTo(T o) {
        if (this.price > o.getPrice()) {
            return 1;
        } else if (this.price < o.getPrice()) {
            return -1;
        } else {
            subCompare(o);
            return 0;
        }
    }
}
