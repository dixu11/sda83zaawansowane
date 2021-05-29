package refleksja;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

class ReflectionDemo {



    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Car car = new Car();
        car.ride();
        System.out.println(car);


        //stworzenie obiektu posiadającego informacje o klasie javowej
        Class<Car> carClass = Car.class;  // wykorzystanie TYPU
        Class<Car> carClass2 = (Class<Car>) car.getClass(); // wykorzystanie OBIEKTU
        Class carClass3 = Class.forName("refleksja.Car"); // wykorzystanie lokalizacji pliku javowego


        System.out.println(Arrays.toString(carClass.getInterfaces()));
        System.out.println(carClass.getName());
        System.out.println(carClass.getPackage());
        System.out.println(carClass.getTypeName());
        System.out.println();
        System.out.println(Modifier.toString(carClass.getModifiers()));
        Method[] methods = carClass.getMethods();
        System.out.println("----");
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getReturnType());
        }


        Method method = carClass.getMethod("ride");
        method.invoke(car);

        // Method method2 = carClass.getMethod("ride", int.class, String.class);
        //wyciągniecie metody z parametrami
        Method method3 = carClass.getMethod("ride", int.class);
        //wywołanie metody z parametrami
        method3.invoke(car, 10);

        Constructor<Car> constructor = carClass.getConstructor();
        Car car2 = constructor.newInstance();
        System.out.println(car);
        System.out.println(car2);

        Constructor<Car> constructor2 = carClass.getConstructor(double.class, String.class);
        Car car3 = constructor2.newInstance(5000, "Punto");
        System.out.println(car3);


        //z obiektu carClass z informacjami o klasie wyciągam tablicę pól
        Field[] fields = carClass.getDeclaredFields();
        //żeby wyciągnąć również prywatne pola uzyjemy wersji "Declared"
        for (Field field : fields) {
            System.out.println(field);
        }
        //wyciągam konkretne pole po nazwie
        Field price = carClass.getDeclaredField("price");
        //ustawiam na tym obiekcie Field żeby dawał dostęp mimo że obiekt jest prywatny
        price.setAccessible(true);
        //ustaw na obiekcie w zmiennej car3, wartość pola price na 1
        price.set(car3, 1);
        System.out.println(car3); // samochod kosztuje 1zł :)


        CarNationality annotation = carClass.getAnnotation(CarNationality.class);
        System.out.println(annotation);
        System.out.println(annotation.nationality());

    }


}
