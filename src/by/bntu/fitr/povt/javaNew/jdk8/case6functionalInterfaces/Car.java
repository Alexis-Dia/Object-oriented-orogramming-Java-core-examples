package by.bntu.fitr.povt.javaNew.jdk8.case6functionalInterfaces;

public class Car {
    private String name;
    private boolean isFullDrive;
    private boolean isGasEngine;

    public Car(String name, boolean isFullDrive, boolean isGasEngine) {
        this.name = name;
        this.isFullDrive = isFullDrive;
        this.isGasEngine = isGasEngine;
    }

    public boolean isFullDrive() {
        return isFullDrive;
    }

    public boolean isGasEngine() {
        return isGasEngine;
    }


    @Override
    public String toString() {
        return name;
    }

    public static boolean returnTrue(Car car) {
        return car.isFullDrive();
    }
}
