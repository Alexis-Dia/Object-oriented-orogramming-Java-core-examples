package by.bntu.fitr.povt.generics.lesson2.case4;

import by.bntu.fitr.povt.generics.lesson2.case4.interfaces.B;
import by.bntu.fitr.povt.generics.lesson2.case4.interfaces.C;
import by.bntu.fitr.povt.generics.lesson2.case4.interfaces.D;

public class Container<T extends Product & B & C & D> {

    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
