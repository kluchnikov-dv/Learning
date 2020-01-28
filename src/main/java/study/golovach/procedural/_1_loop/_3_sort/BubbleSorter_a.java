package study.golovach.procedural._1_loop._3_sort;

//Сортировка пузырьком - гоним меньший элемент влево

import java.util.Arrays;

public class BubbleSorter_a {
    public static void sort(int[] data) {
        for (int barrier = 0; barrier < data.length - 1; barrier++) {
            for (int index = data.length - 1; index > barrier; index--) {
                if (data[index] < data[index - 1]) {
                    int tmp = data[index];
                    data[index] = data[index - 1];
                    data[index - 1] = tmp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 0, 8, 9, 3};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
