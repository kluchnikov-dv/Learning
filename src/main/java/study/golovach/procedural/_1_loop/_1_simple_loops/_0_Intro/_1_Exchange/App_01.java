package study.golovach.procedural._1_loop._1_simple_loops._0_Intro._1_Exchange;

//Идиома - обмен значений переменных без использования временной переменной
//Работает только с целыми числами - в вещественных будут проблемы с округлением

public class App_01 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        a = a + b; //a = 8 b = 5
        b = a - b; //a = 8 b = 3
        a = a - b; //a = 5 b = 3
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

