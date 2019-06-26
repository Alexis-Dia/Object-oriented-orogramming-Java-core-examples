package by.bntu.fitr.povt.generics.lesson3.case2;

public abstract class Product<T> implements Comparable<Product>{

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int subCompare(T p);

/*    @Override
    public int compareTo(T o) {
        if (this.price == o.getPrice()) {
            return 0;
        } else if (this.price < o.getPrice()) {
            return -1;
        } else {
            return 1;
        }
    }*/

    @Override
    public int compareTo(Product o) {
        if (this.price == o.getPrice()) {
            return 0;
        } else if (this.price < o.getPrice()) {
            return -1;
        } else {
            return 1;
        }
    }
}
