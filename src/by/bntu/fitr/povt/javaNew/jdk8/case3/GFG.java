package by.bntu.fitr.povt.javaNew.jdk8.case3;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class GFG {
    public static void main(String[] args)
    {

        // Create a String with no repeated keys
        ArrayList<String[]> str = new<String[]> ArrayList();
        str.add(new String[]{ "GFG", "GeeksForGeeks" });
        str.add(new String[]{ "g", "geeks1" });
        str.add(new String[]{ "g", "geeks2" });
        str.add(new String[]{ "G", "Geeks" });

        // Convert the String to Map
        // using toMap() method
        Map<String, String[]>
                map = str
                .stream()
                .collect(
                //Collectors.toMap(p -> p[0], Function.identity(), (p1, p2) -> p1));
                Collectors.toMap(p -> p[0], Function.identity()));

        // Print the returned Map
        System.out.println("Map:" + map);
    }
}