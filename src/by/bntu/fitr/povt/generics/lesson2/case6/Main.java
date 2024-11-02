package by.bntu.fitr.povt.generics.lesson2.case6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //static boolean find(List<? extends Product> all, Product p) {    //!!! --- if delete '? extends' - doesn't work
        //static boolean find(List<Product> all, Product p) {
        static <T extends Product> boolean find(List<T> all, T p) {

        for (Product sp: all) {
            if (sp.isSameProduct(p)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        List<Camera> cameras1 = new ArrayList();
        find(cameras1, new Camera());

        List<Camera> cameras2 = new ArrayList();
/*
        find(cameras2, new Phone());
        find(cameras2, new Product());
*/

        List<Product> products = new ArrayList();
        find(products, new Camera());
        find(products, new Phone());
    }

}
