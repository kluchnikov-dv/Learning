package study.golovach.procedural._1_loop._3_sort;

import java.util.Arrays;

//Сортировка выборкой - слева на право
public class SelectionSorter_q {

    public static void sort(int[] data) {
        for (int barrier = 0; barrier < data.length - 1; barrier++) {
            for (int index = barrier + 1; index < data.length; index++) {
                if (data[barrier] > data[index]) {
                    int tmp = data[barrier];
                    data[barrier] = data[index];
                    data[index] = tmp;
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
