package study.golovach.procedural._1_loop._3_sort;

import java.util.Arrays;
import java.util.Random;

//Сортировка вставками
//Сортируем все что слева от барьера - т.е. вставляем каждый последующий элемент в нужное место
//в отсортированный список до барьера - просто погружаем до нужного места каждый след элемент
//[4, 5, 1, 0, 8, 9, 3]
//[4, 5, 1, 0, 8, 9, 3] 1 шаг
//[1, 4, 5, 0, 8, 9, 3] 2 шаг
//[0, 1, 4, 5, 8, 9, 3] 3 шаг
//[0, 1, 4, 5, 8, 9, 3] 4 шаг
//[0, 1, 4, 5, 8, 9, 3] 5 шаг
//[0, 1, 3, 4, 5, 8, 9] 6 шаг

public class InsertionSorter_q {
    public static void sort(int[] data) {
        for (int barrier = 1; barrier < data.length; barrier++) {
            int index = barrier - 1;
            int sortBarrier = barrier;
            while (index >= 0 && data[sortBarrier] < data[index]) {
                int tmp = data[sortBarrier];
                data[sortBarrier] = data[index];
                data[index] = tmp;
                sortBarrier = index;
                index--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array0 = {4, 5, 1, 0, 8, 9, 3};
        System.out.println(Arrays.toString(array0));
        sort(array0);
        System.out.println(Arrays.toString(array0));

        int[] array1 = {};
        System.out.println(Arrays.toString(array1));
        sort(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = {2};
        System.out.println(Arrays.toString(array2));
        sort(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = {2, 0};
        System.out.println(Arrays.toString(array3));
        sort(array3);
        System.out.println(Arrays.toString(array3));

        int[] big_array = new int[32 * 1024];
        Random rnd = new Random();
        for (int k = 0; k < big_array.length; k++) {
            big_array[k] = rnd.nextInt();
        }
        long t = System.nanoTime();
            sort(big_array);
        System.out.println("Q: " + (System.nanoTime() - t)/1_000_000);
    }
}
