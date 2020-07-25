package by.bntu.fitr.povt.javaNew.jdk5.forLoopVsFor;

/**
 * @author Alexey Druzik on 25.07.2020
 */
public class People {
    String name;
    Integer age;

    public People() {
    }

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
