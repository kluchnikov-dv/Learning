package study.golovach.procedural._1_loop._1_simple_loops._2_invert;

//цикл for c целочисленным делением и остатком
//в Java нет перегрузки операторов, но есть вшитые перегрузки
//пример: перегруженный "+" для String, int, long, float, double
//нет перегруженного оператора "+" для short и int: short + short = int byte + byte = int
//деление на ноль int и double
//NaN - не число


public class App_00 {
    public static void main(String[] args) {
        //при делениии  int
        for (int k = 0; k < 10; k++) {
            System.out.println(k + " / 2 = " + (k/2) + "    " + k + " % 2 = " + (k%2));
        }
        //при делении int на double - k типа int поднимается jvm до double, поэтому получаем дробную часть
        //логично что используется другой ператор деления
        for (int k = 0; k < 10; k++) {
            System.out.println(k + " / 2 = " + (k/2.0));
            System.out.println(k + " / 2 = " + (k/2d));
        }

        //деление на 0 int выдаст ошибку java.lang.ArithmeticException: / by zero
        //System.out.println(1/0);

        //деление на 0 double выдаст infinity
        System.out.println(1.0/0);

        //деление на 0 double c значением 1.0 выдаст infinity
        double d1 = 1.0 / 0;
        System.out.println(d1);

        //деление на 0 double с значением 0.0 выдаст NaN - not are number - не число!
        double d2 = 0.0 / 0;
        System.out.println(d2);

        //деление на 0 double с значением -0.0 выдаст NaN - not are number - не число!
        double d3 = -0.0 / 0;
        System.out.println(d3);

        //деление на 0 double с значением -1.0 выдаст -infinity
        double d4 = -1.0 / 0;
        System.out.println(d4);

        //пример: пришла строка по интернету, её надо умножить на 2
        String str1 = "123.5";
        double d5 = Double.valueOf(str1);
        System.out.println(d5 * 2);

        //пример: пришла строка по интернету, её надо умножить на 2
        String str2 = "NaN";
        double d6 = Double.valueOf(str2);
        System.out.println(d6 * 2);

        //сравнение NaN
        System.out.println(d6 > 1);
        System.out.println(d6 < 1);
        System.out.println(d6 == 0);
        System.out.println(d6 < 0);
        System.out.println(d6 < 0);
        System.out.println(d6 == d6);
        System.out.println(d6 == Double.POSITIVE_INFINITY);
        System.out.println(d6 > Double.POSITIVE_INFINITY);
        System.out.println(d6 < Double.POSITIVE_INFINITY);

    }
}
