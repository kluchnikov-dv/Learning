package study.golovach.procedural._1_loop._1_simple_loops._1_for;

//цикл с пропуском на увеличение и убывание

public class App_02 {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k +=2) {
            System.out.println("k = " + k);
        }

        for (int k = 10; k >= 0; k -=2) {
            System.out.println("k = " + k);
        }
    }
}
