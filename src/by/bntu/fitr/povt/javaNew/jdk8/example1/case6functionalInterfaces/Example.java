package by.bntu.fitr.povt.javaNew.jdk8.example1.case6functionalInterfaces;

public class Example{
    private static void printTest(Car car, CheckCar check){
        check.test4();
        //check.test5();   //не можем так сделать
        if(check.test(car)){
            System.out.println(car);
        }
    }

    public static void main(String[] args) {
        Car audiA3 = new Car("AudiA3", true, true);
        Car audiA6 = new Car("AudiA6", true, false);
        printTest(audiA3, c -> c.isFullDrive());
        printTest(audiA3, c -> c.isGasEngine());
        printTest(audiA6, c -> c.isFullDrive());
        printTest(audiA6, c -> c.isGasEngine());
    }
}
