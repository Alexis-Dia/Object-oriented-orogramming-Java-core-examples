package by.bntu.fitr.povt.javaNew.jdk8.case9ConveyorStreams.flatMap;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Alexey Druzik on 29.09.2020
 */
public class Student {

    private String name;
    private Set<String> book;

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }
}
