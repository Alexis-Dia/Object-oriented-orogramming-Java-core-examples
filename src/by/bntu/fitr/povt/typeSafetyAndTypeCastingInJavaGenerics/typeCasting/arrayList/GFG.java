package by.bntu.fitr.povt.typeSafetyAndTypeCastingInJavaGenerics.typeCasting.arrayList;

import java.util.ArrayList;

/*
https://www.geeksforgeeks.org/type-safety-and-type-casting-in-java-generics/
 */
class GFG {
    public static void main (String[] args) {
        ArrayList al =new ArrayList();
        al.add("Vivek Yadav");
        al.add("Ravi");
        //Т е без дженериков тут, тебе надо получать обюъект, как Object, затем кастить т е надо делать 'TypeCasting', а это плохо:
        //String name2=(String) al.get(0);
        Object name1= al.get(0);
    }
}
