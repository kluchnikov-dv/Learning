package study.golovach.procedural._1_loop._1_simple_loops._2_invert;

//код который инвертирует наш массив

import java.util.Arrays;

public class ArrayInverter {

    //int place  - меняем переданный массив
    public static void invert1(int[] array) {
        for (int k = 0; k < array.length / 2; k++) {
            int tmp = array[k];
            array[k] = array[array.length - 1 - k];
            array[array.length - 1 - k] = tmp;
        }
    }

    //out place - сохраняем переданный в фунцию массив
    public static void  invert2(int[] array) {
        int[] array2 = new int[array.length];
        for (int k = 0; k < array.length; k++) {
            array2[k] = array[array.length - 1 - k];
        }
        System.out.println(Arrays.toString(array2));
    }

    //рекурсия инверсии  элементов в массиве
    public static void invertRecursion(int[] data, int k) {
        if (k < data.length / 2) {
            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
            invertRecursion(data, ++k);
        }
    }

    public static void main(String[] args) {
        int[] m1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(m1));
        invert1(m1);
        System.out.println(Arrays.toString(m1));

        //нулевой массив
        int[] m2 = {};
        //инвертируем нулевой массив
        invert1(m2);
        System.out.println(Arrays.toString(m2));

        //инвертирование out place
        invert2(m1);
        //исходный массив сохранился
        System.out.println(Arrays.toString(m1));

        //рекурсия инверсии  элементов в массиве
        invertRecursion(m1, 0);
        System.out.println(Arrays.toString(m1));

        //инвертируем рекурсивно нулевой массив
        invertRecursion(m2, 0);
        System.out.println(Arrays.toString(m2));

        //инвертируем рекурсивно массив c одним элементом
        int[] m3 = {0};
        invertRecursion(m3, 0);
        System.out.println(Arrays.toString(m3));

    }


}
