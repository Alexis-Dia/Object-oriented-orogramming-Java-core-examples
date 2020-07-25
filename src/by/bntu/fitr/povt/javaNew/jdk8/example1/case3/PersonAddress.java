package by.bntu.fitr.povt.javaNew.jdk8.example1.case3;

public class PersonAddress {

    private String address;

    public PersonAddress() {
    }

    public PersonAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonAddress{" +
                "address='" + address + '\'' +
                '}';
    }
}
