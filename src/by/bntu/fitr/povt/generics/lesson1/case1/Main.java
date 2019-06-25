package by.bntu.fitr.povt.generics.lesson1.case1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List rawList = new ArrayList();
        List<String> list = new ArrayList();
        //rawList = list;     // OK
        list = rawList;       // Warning
    }
}


