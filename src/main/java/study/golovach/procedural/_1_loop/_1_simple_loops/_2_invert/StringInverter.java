package study.golovach.procedural._1_loop._1_simple_loops._2_invert;

//Инвертирование строки
//В Java строку поменять нельзя, строка всегда имеет одно значение!
//String.charAt - можно прочитать символ из строки, обратного метода присвоения символа НЕТ!


public class StringInverter {
    public static void main(String[] args) {
        String str = "Hello world!";
        System.out.println(str);
        char[] data = str.toCharArray(); //превращаем строку в массив char-ов
        for(int k = 0; k < data.length / 2; k++) {
            char tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;
        }
        System.out.println(new String(data)); //создаем новуюс троку из массива char-ов
    }
}
