package by.bntu.fitr.povt.generics.lesson1.case3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List rawList = new ArrayList();
        List<String> list = new ArrayList();

        rawList = list; //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        rawList.add(8); //In rawList we can add everething - String, Integer and others.

        String s = list.get(0); //ClassCastException

    }
}