package study.golovach.procedural._1_loop._1_simple_loops._3_move;

//Условный обмен элементов массива

import java.util.Arrays;

public class App01 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 0, 8, 9, 6, 2, 7};
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < array.length - 1; k++) {
            conditionalSwap(array, k, k + 1);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void conditionalSwap(int[] array, int fst, int snd) {
        if (array[fst] > array[snd]) {
            int tmp = array[fst];
            array[fst] = array[snd];
            array[snd] = tmp;
        }
    }
}
