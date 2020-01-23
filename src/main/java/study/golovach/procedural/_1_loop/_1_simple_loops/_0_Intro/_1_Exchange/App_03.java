package study.golovach.procedural._1_loop._1_simple_loops._0_Intro._1_Exchange;

//Идиома - обмен значений переменных без использования временной переменной
//XOR - работает только с целочисленными значениями

public class App_03 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("a = " + a + " b = " + b);
        System.out.println("Было: a = " + Integer.toBinaryString(a) + " b = " + Integer.toBinaryString(b));
        a = a ^ b;
        System.out.println("XOR в a: a = " + Integer.toBinaryString(a) + " b = " + Integer.toBinaryString(b));
        b = a ^ b;
        System.out.println("XOR в b: a = " + Integer.toBinaryString(a) + " b = " + Integer.toBinaryString(b));
        a = a ^ b;
        System.out.println("XOR в a: a = " + Integer.toBinaryString(a) + " b = " + Integer.toBinaryString(b));
        System.out.println("a = " + a + " b = " + b);
    }
}

