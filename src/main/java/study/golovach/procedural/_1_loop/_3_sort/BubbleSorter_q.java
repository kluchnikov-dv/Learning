package study.golovach.procedural._1_loop._3_sort;

import java.util.Arrays;
import java.util.Random;

//Сортировка пузырьком - выгоняем самый большой элемент на право

//[4, 5, 1, 0, 8, 9, 3] было
//[4, 1, 0, 5, 8, 3, 9] 1 шаг
//[1, 0, 4, 5, 3, 8, 9] 2 шаг
//[0, 1, 4, 3, 5, 8, 9] 3 шаг
//[0, 1, 3, 4, 5, 8, 9] 4 шаг
//[0, 1, 3, 4, 5, 8, 9] 5 шаг
//[0, 1, 3, 4, 5, 8, 9] 6 шаг
//[0, 1, 3, 4, 5, 8, 9] 7 шаг
//[0, 1, 3, 4, 5, 8, 9] 8 шаг
// ------------------>
// --------------->
// ------------>
// --------->

public class BubbleSorter_q {
    public static void sort(int[] data) {
        for (int barrier = data.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
            if (data[index] > data[index + 1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 0, 8, 9, 3};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));

        //замеряем скорость алгоритма на массиве в 32000 элементов
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
