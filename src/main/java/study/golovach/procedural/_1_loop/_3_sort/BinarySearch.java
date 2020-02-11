package study.golovach.procedural._1_loop._3_sort;

//Встроенный бинарный поиск в массиве
//Если это искомый элемент - выдаст позицию этого элемента
//Если элемента нет - то выдаст должную позицю элемента - 1

//Как оценить сокрость бинарного поиска
//Если скорость чтения 1 элемента = 5мс
//Алгоритм должен вложиться в 100мс
//Если всего элементов 527_000_000, то бинарный поиск найдет элемента за
//logx(y*z*w) = logx(y) + logx(z) + logx(w) =
//log2(527_000_000) = log2(527) + log2(1000) + log2(1000) = 2^9 + 2^10 + 2^10 = 9 + 10 + 10 = 29 сравнений = 29 * 5мс = 145мс


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        System.out.println(Arrays.binarySearch(array, 5));
        System.out.println(Arrays.binarySearch(array, 10));
        System.out.println(Arrays.binarySearch(array, 15));
        System.out.println(Arrays.binarySearch(array, 20));
        System.out.println(Arrays.binarySearch(array, 25));
        System.out.println(Arrays.binarySearch(array, 30));
        System.out.println(Arrays.binarySearch(array, 35));
        System.out.println(Arrays.binarySearch(array, 40));
        System.out.println(Arrays.binarySearch(array, 45));
    }
}
