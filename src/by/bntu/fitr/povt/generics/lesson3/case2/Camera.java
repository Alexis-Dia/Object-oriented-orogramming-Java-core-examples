package by.bntu.fitr.povt.generics.lesson3.case2;

public class Camera extends Product<Camera> {

    private Integer pixels = 1024;

    public Integer getPixels() {
        return pixels;
    }

    public void setPixels(Integer pixels) {
        this.pixels = pixels;
    }

    public int subCompare(Camera o) {
        return 0;
    }
}
