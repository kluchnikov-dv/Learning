package Study.Golovach.Procedural._0_Intro._0_toString;

import java.util.Arrays;
//Все типы в Java делятся на примитивные и ссылочные
//Примитивные: boolean, float, double, byte, short, char, int, long
//Массивы ссылочные - все ссылочные типы имеют предка Java.lang.Object
//У Object есть метод toString()

// "Шаблоны" - проектирования: синглтон, билдер, адаптер, декоратор, визитор, фабрика - "это методы проектирования не зависят от языка"
// "Идиома" - популярный трюк в меньшей экосистеме - "джависты так делают"

public class App_00 {
    public static void main(String[] args) {
        System.out.println("x = " + new Object());
        int [] array1D = {0, 1, 2, 3};
        int [][] array2D = {{0, 1}, {2, 3}};
        System.out.println(array1D); //выведет адрес ссыли на массив
        System.out.println(Arrays.toString(array1D)); //выведет значения массива
        //Arrays - идиома - класс содеражащий множество утилитарных методов для работы с классом Array
        //В процедурном программировании не было классов, поэтому методы не переопределены и вызвать у родителя нельзя
        //Для того чтобы иметь методы для работы с экземпляром класса, все методы хранились в Arrays, Collections, и т.д.


        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D)); //Выводит ссылку на каждый первый элемент двумерного массива
        System.out.println(Arrays.deepToString(array2D)); //Переопределен метод для вывода значени двумерного массива
    }
}
