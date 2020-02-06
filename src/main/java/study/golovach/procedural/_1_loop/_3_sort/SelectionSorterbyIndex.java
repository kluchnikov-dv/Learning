package study.golovach.procedural._1_loop._3_sort;

//Сортировка выборкой по индексу
//Ускоряем сортировку

//Типа теперь так, как и должно быть
//Ищу самый маленький элемент и ставлю его в 1ую позицию
//Ищу самый маленький элемент и ставлю его во 2ую позицию
//Для этого запоминаем индекс меньшего элемента и только потом делаем обмен
//[4, 5, 1, 0, 8, 9, 3]
//[0, 5, 1, 4, 8, 9, 3] 1 шаг
//[0, 1, 5, 4, 8, 9, 3] 2 шаг
//[0, 1, 3, 4, 8, 9, 5] 3 шаг
//[0, 1, 3, 4, 8, 9, 5] 4 шаг
//[0, 1, 3, 4, 5, 9, 8] 5 шаг
//[0, 1, 3, 4, 5, 8, 9] 6 шаг

import java.util.Arrays;
import java.util.Random;

public class SelectionSorterbyIndex {

    public static void sort(int[] data) {
        for (int barrier = 0; barrier < data.length - 1; barrier++) {
            int address = barrier;
            for (int index = barrier + 1; index < data.length; index++) {
                if (data[address] > data[index]) address = index;
            }
            int tmp = data[barrier];
            data[barrier] = data[address];
            data[address] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 0, 8, 9, 3};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));


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
