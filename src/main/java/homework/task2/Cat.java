package homework.task2;

public class Cat extends Animal{
    private String color;
    private boolean kindness;


    public Cat(String name, int age, String color, boolean kindness) {
        super(name, age);
        this.color = color;
        this.kindness = kindness;
    }

    public void makeSound(){
        System.out.println("Кошка мяукает.");
    }

    public void scratch(){
        System.out.println("Кошка точит когти.");
    }

    @Override
    public String toString() {
        return "Кошка по кличке: " + name + ", возраст: " + age + ", цвет: " + color;
    }

}
