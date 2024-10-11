package by.bntu.fitr.povt.typeSafetyAndTypeCastingInJavaGenerics.typeCasting.array;

/*
https://www.geeksforgeeks.org/type-safety-and-type-casting-in-java-generics/
 */
class GFG {
    public static void main(String[] args)
    {
        String name[] = new String[500];
        name[0] = "Vivek Yadav";
        name[1] = "Ravi";
        //name[2] = (String) Integer.valueOf(100);
        //Type-Casting is ok, you can't perform such line:
        //String name1= name.get(1);
    }
}
