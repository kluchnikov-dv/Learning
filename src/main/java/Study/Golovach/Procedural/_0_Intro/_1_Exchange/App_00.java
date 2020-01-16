package Study.Golovach.Procedural._0_Intro._1_Exchange;

//Идиома - обмен значений переменных

public class App_00 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
