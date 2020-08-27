package by.bntu.fitr.povt.multithreading.threadLocal.example1;
import java.text.SimpleDateFormat;
/**
 * Для чего можно использовать ThreadLocal  в Java:
 *  Хранение информации о пользователе и его правах доступа, что позволит не передавать её в качестве аргумента в каждый класс или метод.
 *  Можно использовать ThreadLocal  для кеширования непотокобезопасных ресурсов вроде SimpleDateFormat.
 *  Различные счётчики обращений для потоков.
 * https://riptutorial.com/ru/java/example/6547/%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D0%BE%D0%B5-%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-threadlocal
 * @author Alexey Druzik on 25.08.2020
 */
public class Main {

    // SimpleDateFormat is not thread-safe, so give one to each thread
    // SimpleDateFormat is not thread-safe, so give one to each thread
    private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
    };

    private static final SimpleDateFormat formatter2 = new  SimpleDateFormat("yyyyMMdd HHmm");;

    public static void main(String[] args) throws InterruptedException {
        for(int i=0 ; i<3; i++){
            new ThreadLocalExample1(formatter, ""+i);
            //new ThreadLocalExample2(formatter2, ""+i);
        }
    }

}
