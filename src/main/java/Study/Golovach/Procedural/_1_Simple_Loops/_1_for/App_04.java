package Study.Golovach.Procedural._1_Simple_Loops._1_for;

//цикли for c избавлением от операторов
//

public class App_04 {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k++) {
            System.out.println(" " + k);
            k--;
            System.out.println(" " + k);
            break;
        }

        //отказываемся от третьего оператора в for
        for (int k = 0; k < 10;) {
            System.out.print(" " + k);
            k++;
            //System.out.println(" " + k);
            //break;
        }

        //отказываемся от второго и третьего оператора в for
        for (int k = 0;;) {
            if (k < 10) {
                System.out.print(" " + k);
                k++;
            }
            else {
                break;
            }
        }

        //отказываемся от всех операторов в for
        int k = 0;
        for (;;) {
            if (k < 10) {
                System.out.print(" " + k);
                k++;
            } else {
                break;
            }
        }

        //отказываемся от for
        int l = 0;
        while (true) {
            if (l < 10) {
                System.out.print(" " + l);
                l++;
            } else {
                break;
            }
        }
    }
}
