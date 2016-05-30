import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Fisher on 30.05.2016.
 */
public class Hack {

    public static void main(String[] args) {
        Car car = new Car();
        Class c = car.getClass();       //получаю имя класс
        System.out.println(c);
        System.out.println();

        Field[] publicFields = c.getDeclaredFields();  //получаю массив полей
        System.out.println("Поля класса:");
        for (Field field : publicFields) {
            Class fieldType = field.getType();
            System.out.print(field.getName());
            System.out.println(" (" + fieldType.getName() + ")");
        }
        System.out.println();


        Constructor[] constructors = c.getDeclaredConstructors();  //получаю массив конструкторов
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            System.out.print("Конструктор (");
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println(")");
        }
        System.out.println();


        Method[] methods = c.getDeclaredMethods();      //получаю массив методов
        System.out.println("Приватные методы:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Car car2 = new Car();                           //динамически создаем экзепляр класса и устанавливаем значения полей
        try {
            Field f = car2.getClass().getDeclaredField("name");
            f.setAccessible(true);
            f.set(car2, "Nexia");

            f = car2.getClass().getDeclaredField("weight");
            f.setAccessible(true);
            f.set(car2, 1300);

            f = car2.getClass().getDeclaredField("name");
            f.setAccessible(true);
            f.set(car2, 115d);
        }
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
