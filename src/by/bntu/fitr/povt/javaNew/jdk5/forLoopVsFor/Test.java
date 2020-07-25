package by.bntu.fitr.povt.javaNew.jdk5.forLoopVsFor;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Alexey Druzik on 25.07.2020
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> collection1 = Arrays.asList("s1", "s2", "s3");
        Collection<StringBuilder> collection2 = Arrays.asList(new StringBuilder("s1"), new StringBuilder("s2"), new StringBuilder("s3"));

        System.out.println(collection2);
        for(StringBuilder element: collection2) {
            /*For some reason, I don't know why, but this line will update collection2:*/
            element.append("_");
            /*For some reason, I don't know why, but this line won't update collection2:*/
            //element = new StringBuilder("v");
        }
        System.out.println(collection2);
        for(StringBuilder element: collection2) {
            System.out.println(element);
        }

        String boss = "boss";
        char[] array = boss.toCharArray();

        for(char c : array)
        {
            if (c== 'o')
                c = 'a';
        }
        System.out.println(new String(array)); //

        Collection<People> collection3 = Arrays.asList(
            new People("Alex", 21),
            new People("Bob", 31),
            new People("Henry", 41)
        );
        for(People element: collection3) {
            if (element.name == "Henry") {
                element.setAge(51);
            }
        }
        for(People element: collection3) {
            System.out.println(element);
        }
    }
}
