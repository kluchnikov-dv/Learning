package study.golovach.procedural._1_loop._2_nested_loops;

//Вложенный цикл c неполным проходом
//0
//0 10
//0 10 20
//0 10 20 30
//0 10 20 30 40

//Цикл для сортировки с неполным проходом
//0 10 20 30 40
//0 10 20 30
//0 10 20
//0 10
//0

public class App20 {
    public static void main(String[] args) {
        int[] array = {0, 10, 20, 30, 40};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }

        //цикл для сортировки с неполным проходом
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - i); j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }

        //цикл для сортировки с неполным проходом
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }

    }
}
