import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hW_1_2 {

    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первую переменную");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Введите вторую переменную");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Какую операцию совершить?");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");

        switch (Integer.parseInt(reader.readLine())){

            case 1:
                System.out.println("Результат сложения = " + (a+b));
            case 2:
                System.out.println("Результат вычитания = " + (a-b));
            case 3:
                System.out.println("Результат умножения = " + (a*b));
            case 4:
                System.out.println("Результат деления = " + ((double)a/b));
        }
    }

}
