package study.golovach.procedural._1_loop._2_nested_loops;

//Вложенный цикл и тернарный условный оператор

//+++++
//++++-
//+++--
//++---
//+----

public class App03 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(((i + j < 5)?"+":"-"));
            }
            System.out.println();
        }
    }
}
