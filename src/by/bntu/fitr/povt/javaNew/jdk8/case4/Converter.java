package by.bntu.fitr.povt.javaNew.jdk8.case4;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);


}
