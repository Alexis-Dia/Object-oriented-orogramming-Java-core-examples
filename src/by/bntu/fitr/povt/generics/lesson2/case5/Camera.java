package by.bntu.fitr.povt.generics.lesson2.case5;

public class Camera extends Product implements Comparable<Camera> {

    Integer pixel = 1024;

    public Camera() {
    }

    public Camera(Integer pixel) {
        this.pixel = pixel;
    }

    public Integer getPixel() {
        return pixel;
    }

    public void setPixel(Integer pixel) {
        this.pixel = pixel;
    }

    @Override
    public int compareTo(Camera o) {
        return pixel.compareTo(o.getPixel());
    }

}
