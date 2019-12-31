package by.bntu.fitr.povt.generics.lesson3.case2;

public class Camera extends Product {

    private Integer pixels = 1024;

    public Integer getPixels() {
        return pixels;
    }

    public void setPixels(Integer pixels) {
        this.pixels = pixels;
    }

    public int subCompare(Product o) {
        if (this.pixels > ((Camera) o).getPixels()) {
            return 1;
        } else if (this.pixels < ((Camera) o).getPixels()) {
            return -1;
        } else {
            return 0;
        }
    }
}
