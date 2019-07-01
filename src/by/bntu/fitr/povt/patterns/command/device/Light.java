package by.bntu.fitr.povt.patterns.command.device;

public class Light {
    String name;

    public Light(String name){
        this.name = name;
    }

    public void on(){ System.out.println("Light ON!");  }

    public void off(){
        System.out.println("Light OFF!");
    }
}
