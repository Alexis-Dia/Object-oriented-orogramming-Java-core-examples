package by.bntu.fitr.povt.generics.lesson3.case4;

public class Phone extends Product<Phone> {

    Double diagonal = 5.0;

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public int subCompare(Phone p) {
        return 0;
    }
}
