package by.bntu.fitr.povt.generics.lesson3.case2;

public class Phone extends Product {

    private Double diagonal = 5.0;

    private Double getDiagonal() {
        return diagonal;
    }

    public int subCompare(Product o) {
        //return this.diagonal.compareTo(((Phone) o).getDiagonal());
        if (this.diagonal > ((Phone) o).getDiagonal()) {
            return 1;
        } else if (this.diagonal < ((Phone) o).getDiagonal()) {
            return -1;
        } else {
            return 0;
        }
    }

}
