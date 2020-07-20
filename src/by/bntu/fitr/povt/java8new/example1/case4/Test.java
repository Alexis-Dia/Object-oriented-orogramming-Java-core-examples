package by.bntu.fitr.povt.java8new.example1.case4;

/**
 * Exmples from:
 * https://habr.com/en/post/216431/
 * For compiling:
 * javac -d E:\IdeadProjects\helloWorldProj\Object-oriented-orogramming-Java-core-examples\src\by\bntu\fitr\povt\java8new\example1\case4\out -sourcepath E:\IdeadProjects\helloWorldProj\Object-oriented-orogramming-Java-core-examples\src E:\IdeadProjects\helloWorldProj\Object-oriented-orogramming-Java-core-examples\src\by\bntu\fitr\povt\java8new\example1\case4\Test.java
 *
 */
public class Test {

    public static void main(String[] args) {
/*        String s1 = "BBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        String s2 = new String("BBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        String s3 = new String("BBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        boolean b1 = s1.equals(s2);
        //System.out.println(s3 == s2);

        Integer i1 = 1;
        Integer i2 = 1;
        Integer i3 = new Integer(1);
        //++i2;
        //Integer i4 = i1;
        //i1 = 5;
        i1 = 5;
        boolean b2 = i1.equals(i2);
        System.out.println(b2);

        String str1 = "I love Java";

        String str2 = str1;//обе переменные-ссылки указывают на одну строку.
        System.out.println(str2);

        str1 = "I love Python";//но поведение str1 никак не влияет на str2
        System.out.println(str2);
        System.out.println(str1);

        IntegerPair p1 = new IntegerPair(5, 10);
        IntegerPair p2 = p1;
        System.out.println(p2);
        p1 = new IntegerPair(1, 1);
        System.out.println(p2);

        final Integer fi = 1;
        Integer fi2 = fi;

        MyInteger mi1 = new MyInteger(1);
        MyInteger mi2 = mi1;
        System.out.println(mi2);

        mi1 = new MyInteger(2);
        System.out.println(mi2);
        System.out.println(mi1);*/

        Formula formula1 = (a) ->  Integer.valueOf(a);
        Formula formula1_1 = (a) ->  a;
        Formula formula2 = Integer::valueOf;
        Formula formula3 = Something::startsWithStatic;

        Something something = new Something();
        Formula formula4 = something::startsWith;

        double d1 = formula1.calculate(1);
        double d2 = formula2.calculate(1);
        double d3 = formula3.calculate(1);
        double d4 = formula4.calculate(1);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);

    }


}
