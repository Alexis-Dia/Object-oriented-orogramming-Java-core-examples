package by.bntu.fitr.povt.java8new.example1.case6functionalInterfaces;

@FunctionalInterface
interface CheckCar{
    public boolean test(Car car);

    default boolean test2(Car car) {
        return true;
    };

    default boolean test3(Car car) {
        return false;
    };

    default void test4() {
        System.out.println("ho!");
    };

    static void test5() {
        System.out.println("yo-ho!");
    };
}
