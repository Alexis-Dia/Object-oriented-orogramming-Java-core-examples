package by.bntu.fitr.povt.typeSafetyAndTypeCastingInJavaGenerics.typeSafetyExample.arrayList;

import java.util.ArrayList;

/*
https://www.geeksforgeeks.org/type-safety-and-type-casting-in-java-generics/
 */
class GFG {
    public static void main (String[] args) {
        ArrayList al =new ArrayList();
        al.add("Vivek Yadav");
        al.add("Ravi");
        //Not type-safe:
        al.add(Integer.valueOf(10));

        String name1 = (String)al.get(0);
        String name2 = (String)al.get(1);
        String name3 = (String)al.get(2);
    }
}
