import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hW_2_2 {

    // Создать программу, выводящую на экран ближайшее к 10 из двух положительных чисел, записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Данный код определяет, какое из двух положительных чисел ближе всего к 10. Введите два любых положительных числа:");

        double m = Double.parseDouble(reader.readLine()); // Первая переменная

        if (m <= 0) {
            System.out.println("Не, не, не. Число должно быть положительным) Shutdown protocol");
        } else {
            System.out.println("Первое число = " + m);
        }


        double n = Double.parseDouble(reader.readLine());

        if (n <= 0) {
            System.out.println("Не, не, не. Число должно быть положительным) Shutdown protocol");
        } else if (n == m) {
            System.out.println("Числа одинаковые! Попробуешь новое число?"); // Првоерка на одинаковые числа
            n = Double.parseDouble(reader.readLine());
        } else {
            System.out.println("Второе число = " + n);
        }


        if (Math.abs((10 - m)) < Math.abs((10 - n))) { // Выявление ближайшего числа по модулю
            System.out.println("Первое число ближе к 10!");
        } else {
            System.out.println("Второе число ближе к 10!");
        }

    }
}
