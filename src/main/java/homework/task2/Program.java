package homework.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {
    /*
### Задача 1:
Создайте абстрактный класс "Animal" с полями "name" и "age".
Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
Выведите на экран информацию о каждом объекте.
Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
 */
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Animal cat = new Cat("Цири", 1, "Серая", false);
        Animal dog = new Dog("Плюша", 4, "Корги", "Сидеть");

        Animal[] animals = new Animal[2];
        animals[0] = cat;
        animals[1] = dog;

        //Выведите на экран информацию о каждом объекте
        for(Animal animal: animals){
            Class<?> clazz = animal.getClass();
            Class<?> superClazz = clazz.getSuperclass();

            System.out.println("Объект принадлежит классу: " + clazz.getName() + ", который наследован от: " + superClazz.getName());

            Field[] fields = clazz.getDeclaredFields();
            System.out.println("Объект имеет поля: ");
            for (Field field : fields){
                System.out.println("Поле класса: " + field.getName());
            }
            Field[] superFields = superClazz.getDeclaredFields();
            System.out.println("Объект имеет поля родительского класса: ");
            for (Field field : superFields){
                System.out.println("Поле родительский класса: " + field.getName());
            }

            System.out.println("Объект имеет методы: ");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Метод: " + method.getName());
            }

            for (Method method : methods){
                if(method.getName().equals("makeSound")){
                    method.invoke(animal);
                    break;
                }
            }

        }
    }
}
