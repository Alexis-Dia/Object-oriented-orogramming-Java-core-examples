package by.bntu.fitr.povt.generics.lesson2.case7;

public class Container<T extends Product & Comparable<T>> {

    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
