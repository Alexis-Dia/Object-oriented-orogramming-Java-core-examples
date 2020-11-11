package by.bntu.fitr.povt.immutable.case5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Alexey Druzik on 10.11.2020
 * Pay attention at the describing List.of()-method - https://docs.oracle.com/javase/9/docs/api/java/util/List.html
 * Pay attention at the describing List.of()-method - https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html
 * https://habr.com/ru/company/piter/blog/470149/ (orig - https://nipafx.dev/immutable-collections-in-java#)
 * Difference between  Immutable collection and Unmodifiable collection:
 *     Unmodifiable collection(also calls Structually Modified) - Collections that do not support modification operations
 *         (such as add, remove and clear) are referred to as unmodifiable. Collections that are not unmodifiable are modifiable.
 *     Immutable collection - Collections that additionally guarantee that no change in the Collection object will be
 *         visible are referred to as immutable. Collections that are not immutable are mutable.
 */
public class Main {

    @Test
    public void unmodifiableListTest(){
        List<String> modifiable = new ArrayList<>();
        modifiable.add("1");

        List<String> unmodifiable = Collections.unmodifiableList(modifiable);

        assertEquals("should have the same size", modifiable.size(), unmodifiable.size());

        modifiable.add("2");

        assertEquals("should still have the same size", modifiable.size(), unmodifiable.size());

/*        try {
            unmodifiable.add("3");
            assertTrue("should not succeed", false);
        } catch(UnsupportedOperationException ex){
            assertTrue("should throw exception", true);
        }*/

        assertEquals("should still have the same size", modifiable.size(), unmodifiable.size());
    }

    @Test
    public void immutableListTest(){
        List<String> modifiable = new ArrayList<>();
        modifiable.add("1");

        List<String> immutable = Collections.unmodifiableList(new ArrayList<>(modifiable));

        assertEquals("should have the same size", modifiable.size(), immutable.size());

        modifiable.add("2");

        assertTrue("should no longer have the same size", modifiable.size() != immutable.size());

/*        try {
            immutable.add("3");
            assertTrue("should not succeed", false);
        } catch(UnsupportedOperationException ex){
            assertTrue("should throw exception", true);
        }*/

    }

}
