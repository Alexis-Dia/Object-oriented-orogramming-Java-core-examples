package by.bntu.fitr.povt.generics.lesson2.case8;

public class Product {

    String name = "Product Name";
    String price = "Product Price";

    public Product() {
    }

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isSameProduct(Product p) {
        if (this.name == p.name && this.price == p.price) {
            return true;
        }
        return false;
    }

}
