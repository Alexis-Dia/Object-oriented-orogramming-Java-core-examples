package by.bntu.fitr.povt.reflection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

class Test {

    public static void main(String[] args) {

        String fileCharacterName = "\\E:\\IdeadProjects\\helloWorldProj\\Object-oriented-orogramming-Java-core-examples\\src\\by\\bntu\\fitr\\povt\\reflection\\Employee.txt";
        BufferedReader bufferedReader;

        try {
            Class<?> clazz = (Class<?>) Class.forName("by.bntu.fitr.povt.reflection.pojo.Employee");
            Object object = clazz.newInstance();
            object.getClass().getDeclaredMethod("setFirstName", String.class).invoke(object, "Ivan");
            object.getClass().getDeclaredMethod("setLastName", String.class).invoke(object, "Ivanov");
            object.getClass().getDeclaredMethod("setAge", int.class).invoke(object, 99);
            System.out.println(object);
            //Employee e = new Employee();
            //Employee e2 = new Employee();
            bufferedReader = new BufferedReader(new FileReader(fileCharacterName));
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
