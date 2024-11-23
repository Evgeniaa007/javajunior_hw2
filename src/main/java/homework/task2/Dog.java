package homework.task2;

public class Dog extends Animal{
    String breed;
    String command;

    public Dog(String name, int age, String breed, String command) {
        super(name, age);
        this.breed = breed;
        this.command = command;
    }

    public void makeSound(){
        System.out.println("Пёс лает.");
    }

    public void executeCommand(String command){
        System.out.println("Собака делает команду " + command);
    }

    @Override
    public String toString() {
        return "Собака по кличке: " + name + ", возраст: " + age + ", порода: " + breed
                + ", знает команды: " + breed;
    }

}
