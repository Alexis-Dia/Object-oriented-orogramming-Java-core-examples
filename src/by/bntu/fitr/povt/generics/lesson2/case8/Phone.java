package by.bntu.fitr.povt.generics.lesson2.case8;

public class Phone extends Product {

    String model = "Default Model Name";

    public Phone() {
    }

    public Phone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
