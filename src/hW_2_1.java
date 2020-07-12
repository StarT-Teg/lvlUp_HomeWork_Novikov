import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hW_2_1 {

    //Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Данный код определяет, является ли введённое число чётным или нечётным. Введите любое число:");

        if (Integer.parseInt(reader.readLine()) % 2 == 0) {
            System.out.println("Чёт!");
        } else {
            System.out.println("Нечет!");
        }

    }

}
