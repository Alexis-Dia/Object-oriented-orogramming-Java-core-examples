package by.bntu.fitr.povt.generics.lesson3.case0;

public class Camera extends Product {

    private Integer pixels = 1024;

    public Integer getPixels() {
        return pixels;
    }

    public void setPixels(Integer pixels) {
        this.pixels = pixels;
    }

    public int subCompare(Product o) {
        return 0;
    }
}
