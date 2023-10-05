import java.util.UUID;

public abstract class Person {
    protected int age;
    protected String name;
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public abstract void info();

}
