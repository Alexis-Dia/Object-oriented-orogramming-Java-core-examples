package by.bntu.fitr.povt.generics.lesson3.case4;

public class Camera extends Product<Camera> {

    Integer pixels = 1024;

    public Integer getPixels() {
        return pixels;
    }

    public void setPixels(Integer pixels) {
        this.pixels = pixels;
    }

    @Override
    public int subCompare(Camera p) {
        return 0;
    }
}
