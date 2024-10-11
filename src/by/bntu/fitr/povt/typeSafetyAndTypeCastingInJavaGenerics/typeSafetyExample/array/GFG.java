package by.bntu.fitr.povt.typeSafetyAndTypeCastingInJavaGenerics.typeSafetyExample.array;

/*
https://www.geeksforgeeks.org/type-safety-and-type-casting-in-java-generics/
 */
class GFG {
    public static void main(String[] args)
    {
        String name[] =new String[500];
        name[0] = "Vivek Yadav";
        name[1] = "Ravi";
        //Type-safe, you can't perform such line:
        //name[2] = Integer.valueOf(100);
    }
}
