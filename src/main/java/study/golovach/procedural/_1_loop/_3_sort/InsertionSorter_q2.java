package study.golovach.procedural._1_loop._3_sort;

//Сортировка вставками - немного улучшаем алгоритм
//Сортируем все что слева от барьера - т.е. вставляем каждый последующий элемент в нужное место
//в отсортированный список до барьера - просто погружаем до нужного места каждый след элемент
//1. в этот раз запоминаем каждый следующий элемент
//2. сдвигаем сортируемую часть вправо до нужного места
//3. вставляем наш новый элемент
//[4, 5, 1, 0, 8, 9, 3]
//[4, 5, 1, 0, 8, 9, 3] 1 шаг
//[1, 4, 5, 0, 8, 9, 3] 2 шаг
//[0, 1, 4, 5, 8, 9, 3] 3 шаг
//[0, 1, 4, 5, 8, 9, 3] 4 шаг
//[0, 1, 4, 5, 8, 9, 3] 5 шаг
//[0, 1, 3, 4, 5, 8, 9] 6 шаг

//эта сортировка вставками улучшает время в 1/3 раз, по сравнению с сортировкой вставками с обменом

import java.util.Arrays;
import java.util.Random;

public class InsertionSorter_q2 {
    public static void sort (int[] data) {
        for (int barrier = 1; barrier < data.length; barrier++) {
            int next = data[barrier];
            int index = barrier - 1;
            while(index >= 0 && next < data[index]) {
                data[index + 1] = data[index]; //шифтуем
                index--;
            }
            data[index + 1] = next; //вставляем элемент который запомнили в нужное место
        }
    }

    public static void main(String[] args) {
        int[] array0 = {4, 5, 1, 0, 8, 9, 3};
        System.out.println(Arrays.toString(array0));
        sort(array0);
        System.out.println(Arrays.toString(array0));

        int[] big_array = new int[32 * 1024];
        Random rnd = new Random();
        for (int i = 0; i < big_array.length; i++){
            big_array[i] = rnd.nextInt();
        }
        long t = System.nanoTime();
        sort(big_array);
        System.out.println("Q: " + (System.nanoTime() - t)/1_000_000);
    }
}
