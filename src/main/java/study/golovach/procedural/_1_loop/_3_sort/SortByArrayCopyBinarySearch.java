package study.golovach.procedural._1_loop._3_sort;

import java.util.Arrays;

//Алгоритм вставки новых элементов в отсортированный массив

public class SortByArrayCopyBinarySearch {
    public static void main(String[] args) {
        int size = 5;
        int [] array = {20, 30, 40, 50, 60, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        int [] insert = {15, 90, 30};

        for (int newElem : insert) {
            int newPosition = Arrays.binarySearch(array, 0, size, newElem);
            if (newPosition < 0) newPosition = - newPosition - 1;
            System.arraycopy(array, newPosition, array, newPosition + 1, size - newPosition);
            array[newPosition] = newElem;
            System.out.println(Arrays.toString(array));
            size++;
        }


    }
}
