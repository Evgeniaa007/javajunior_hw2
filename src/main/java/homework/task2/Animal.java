package homework.task2;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Животное по кличке: " + name + ", возраст: " + age;
    }
}
