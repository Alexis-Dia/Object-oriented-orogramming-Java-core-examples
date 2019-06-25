package by.bntu.fitr.povt.generics.lesson2.case7;

import java.util.ArrayList;
import java.util.List;

public class Main {

     static <T extends Product> boolean find(List<? extends Product> all, T p) {

        for (Product sp: all) {
            if (sp.isSameProduct(p)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        List<Camera> cameras = new ArrayList();
        find(cameras, new Camera());
        find(cameras, new Phone());

    }

}
