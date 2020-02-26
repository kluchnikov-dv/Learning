package study.golovach.procedural._1_loop._3_sort;

import java.util.Arrays;

//обьеденить и отсортировать два отсортированных массива

public class MergeTwoArrays {

    public static int[] merge(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int array1Index = 0;
        int array2Index = 0;

        if (array1.length == 0 && array2.length == 0) return null;
        if (array1.length == 0) return array2;
        if (array2.length == 0) return array1;

        while (array1Index + array2Index != result.length) {
            if (array1[array1Index] < array2[array2Index]) {
                result[array1Index + array2Index] = array1[array1Index++];
                if (array1Index == array1.length) {
                    System.arraycopy(array2, array2Index, result, array1Index + array2Index, array2.length - array1.length + 1);
                    break;
                }
            } else {
                result[array1Index + array2Index] = array2[array2Index++];
                if (array2Index == array2.length) {
                    System.arraycopy(array1, array1Index, result, array1Index + array2Index, array1.length - array2.length + 1);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ar1 = {0, 0, 15, 20, 30};
        int[] ar2 = {1, 2, 6, 25, 40, 40, 60};
        //если один из масивов нулевой
        //int[] ar1 = {};
        //int[] ar2 = {1, 2, 6, 25, 40, 40, 60};
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        System.out.println(Arrays.toString(merge(ar1, ar2)));
    }
}
