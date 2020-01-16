package Study.Golovach.Procedural._1_Simple_Loops._1_for;

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
