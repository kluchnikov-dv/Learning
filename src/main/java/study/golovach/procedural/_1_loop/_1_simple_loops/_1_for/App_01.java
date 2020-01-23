package study.golovach.procedural._1_loop._1_simple_loops._1_for;

//цикл вывода значиний массива

public class App_01 {
    public static void main(String[] args) {
        int[] array = {0, 10, 20, 30, 40, 50, 60};
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k] + " ");
        }
    }
}
