package Study.Golovach.Procedural._1_Simple_Loops._1_for;

//цикл вывода значиний массива

public class App_01 {
    public static void main(String[] args) {
        int[] array = {0, 10, 20, 30, 40, 50, 60};
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k] + " ");
        }
    }
}
