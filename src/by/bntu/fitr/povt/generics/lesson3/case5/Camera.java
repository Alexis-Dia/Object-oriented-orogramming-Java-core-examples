package by.bntu.fitr.povt.generics.lesson3.case5;

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
        if (this.pixels > p.getPixels()) {
            return 1;
        } else if (this.pixels < p.getPixels()) {
            return -1;
        } else {
            return 0;
        }
    }
}
