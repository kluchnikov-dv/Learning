package study.golovach.procedural._1_loop._3_sort;

import java.util.Arrays;
import java.util.Random;

//Сортировка выборкой - слева на право

//Типа так должно быть
//Ищу самый маленький элемент и ставлю его в 1ую позицию
//Ищу самый маленький элемент и ставлю его во 2ую позицию

//Но по факту обмен происходит чаще в этом алгоритме
//первый элемент сравниваю с каждым следующим и если нахожу меньше чем текущий, делаю обмен
//потом второй сравниваю с каждым следующим и если нахожу меньше чем текущий, делаю обмен

//[4, 5, 1, 0, 8, 9, 3]
//[0, 5, 4, 1, 8, 9, 3]
//[0, 1, 5, 4, 8, 9, 3]
//[0, 1, 3, 5, 8, 9, 4]
//[0, 1, 3, 4, 8, 9, 5]
//[0, 1, 3, 4, 5, 9, 8]
//[0, 1, 3, 4, 5, 8, 9]
//[0, 1, 3, 4, 5, 8, 9]
public class SelectionSorter_q {

    public static void sort(int[] data) {
        for (int barrier = 0; barrier < data.length - 1; barrier++) {
            for (int index = barrier + 1; index < data.length; index++) {
                if (data[barrier] > data[index]) {
                    int tmp = data[index];
                    data[index] = data[barrier];
                    data[barrier] = tmp;
                }
            }
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
