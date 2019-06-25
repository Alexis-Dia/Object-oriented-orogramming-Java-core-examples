package by.bntu.fitr.povt.generics.lesson2.case3;

public class Container<T extends Product> {

    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
