package study.golovach.procedural._1_loop._2_nested_loops;

//Вложенный цикл
//(0,0) (0,1) (0,2) (0,3) (0,4)
//(1,0) (1,1) (1,2) (1,3) (1,4)
//(2,0) (2,1) (2,2) (2,3) (2,4)
//(3,0) (3,1) (3,2) (3,3) (3,4)
//(4,0) (4,1) (4,2) (4,3) (4,4)

public class App00 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
