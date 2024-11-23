package homework.task1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> clazz = String.class;
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Методы класса String: ");
        for(Method method : methods){
            System.out.println(method.getName());
        }
    }


}