package study.golovach.procedural._1_loop._1_simple_loops._0_Intro._1_Exchange;

public class App_02 {
    public static void main(String[] args) {
        int a = 1_500_000_000;
        int b = 1_600_000_000;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b; //a = -1194967296 b = 1600000000
        b = a - b; //a = -1194967296 b = 1500000000
        a = a - b; //a = 1600000000 b = 1500000000
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

