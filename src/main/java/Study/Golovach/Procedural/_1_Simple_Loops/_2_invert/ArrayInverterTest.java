package Study.Golovach.Procedural._1_Simple_Loops._2_invert;

import java.util.Arrays;

//инвертирование массива от середины
//считается что сравнение k > 0 - быстрее выполняется процессором
//чем k < array.length / 2

public class ArrayInverterTest {

    public static void invertArray(int[] array) {
        for (int k = array.length / 2; k > 0 ; k--) {
            int tmp = array[k - 1];
            array[k - 1] = array[array.length - k];
            array[array.length - k] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] m1 = {1, 2, 3, 4, 5, 6, 7};
        int[] m2 = {};
        int[] m3 = {1};
        int[] m4 = {1, 2, 3, 4, 5, 6};

        invertArray(m1);
        System.out.println(Arrays.toString(m1));
        invertArray(m2);
        System.out.println(Arrays.toString(m2));
        invertArray(m3);
        System.out.println(Arrays.toString(m3));
        invertArray(m4);
        System.out.println(Arrays.toString(m4));
    }
}
