package study.golovach.procedural._1_loop._3_sort;

//Встроенная утилита копирования массива
//Сравнение времени работы встроенной arrayCopy() и цикла for

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2 ,3, 4, 5, 6};
        int[] arr2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //Исходные
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        //Копируем
        System.arraycopy(arr1, 2, arr2, 3, 4);
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        //Копируем в тот же массив
        System.arraycopy(arr1, 0, arr1, 3, 3);
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        byte[] array = new byte[1_000_000];
        testArrayCopy(array);

        testLoopFor(array);
    }

    //тест всстроенной arrayCopy()
    public static void testArrayCopy(byte[] array) {
        long start = System.nanoTime();
        System.arraycopy(array, 1, array, 2, array.length - 2);
        long stop = System.nanoTime();
        System.out.printf("arraycopy: %,10d\n", stop - start);
    }

    //тест цикла for работающий по аналогии arrayCopy()
    public static void testLoopFor(byte[] array) {
        //Random rnd = new Random();
        long start = System.nanoTime();
        //for(int k = 0; k < array.length - 1; k++) {
        //    array[k] = rnd.nextInt();
        //}
        //вывод первых 10 элементов
        //for(int k = 0; k < 10; k++) {
        //    System.out.print(array[k] + "  ");
        //}
        //System.out.println();

        //шифтуем
        byte temp = array[0];
        for(int k = 0; k < array.length - 2; k++) {
            byte save = array[k + 1];
            array[k + 1] = temp;
            temp = save;
        }

        //вывод первых 10 элементов
        //for(int k = 0; k < 10; k++) {
        //    System.out.print(array[k] + "  ");
        //}
        //System.out.println();

        long stop = System.nanoTime();
        System.out.printf("loop for: %,10d\n", stop - start);
    }

}
