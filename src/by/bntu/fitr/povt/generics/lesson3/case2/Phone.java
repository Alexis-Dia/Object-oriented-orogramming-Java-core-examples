package by.bntu.fitr.povt.generics.lesson3.case2;

public class Phone extends Product<Phone> {

    private Double diagonal = 5.0;

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }

    public int subCompare(Phone o) {
        return 0;
    }

}
