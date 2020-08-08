package by.bntu.fitr.povt.javaNew.jdk8.case10TerminalStreams;

/**
 * @author Alexey Druzik on 27.07.2020
 */
class Item {
    private int value;

    // constructors

    public Item(int value) {
        this.value = value;
    }

    public boolean isQualified() {
        return value % 2 == 0;
    }

    public boolean isQualified(Item value) {
        return value.getValue() == 2;
    }

    public int getValue() {
        return value;
    }

    public void operate() {
        System.out.println("Even Number");
    }

    @Override
    public String toString() {
        return "Item{" +
            "value=" + value +
            '}';
    }
}
