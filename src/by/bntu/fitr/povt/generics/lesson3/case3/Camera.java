package by.bntu.fitr.povt.generics.lesson3.case3;

public class Camera extends Product<Camera> {

    private Integer pixels = 1024;

    private Integer getPixels() {
        return pixels;
    }

    public int subCompare(Camera o) {
        if (this.pixels > o.getPixels()) {
            return 1;
        } else if (this.pixels < o.getPixels()) {
            return -1;
        } else {
            return 0;
        }
    }
}
