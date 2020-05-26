package by.bntu.fitr.povt.generics.lesson3.case3;

public class Phone extends Product<Phone> {

    private Double diagonal = 5.0;

    public Double getDiagonal() {
        return diagonal;
    }

    public int subCompare(Phone o) {
        if (this.diagonal > o.getDiagonal()) {
            return 1;
        } else if (this.diagonal < o.getDiagonal()) {
            return -1;
        } else {
            return 0;
        }
    }
}
