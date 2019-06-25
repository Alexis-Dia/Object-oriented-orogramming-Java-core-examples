package by.bntu.fitr.povt.generics.lesson2.case1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void print(Collection<String> collection) {
        System.out.println("generic");
        for (String string : collection) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {

        List<String> strList = new ArrayList();
        List<Object> objList = new ArrayList();

        print(strList);  // Ok
        //print(objList);  // Compile Eroor

    }
}
