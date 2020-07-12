import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class hW_2_4 {

    //Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру. Примеры работы программы:

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Данный код выводит на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру:");

        int rnd = new Random().nextInt(((999 - 100) + 1) + 100); // Рандом

        int tmpMax = rnd % 10; // Переменная с наибольшим значением

        System.out.println("Сгенерированное число = " + rnd);

        for (int i = 0; i < 3; i++) { // Собираем остаток деления от 10 и сравниваем с tmpMax, уменьшая на 10 первоначальное значение
            if (rnd % 10 > tmpMax) {
                tmpMax = rnd % 10;
                rnd /= 10;
            } else {
                rnd /= 10;
            }
        }

        System.out.println("Наибольшее число в цифре = " + tmpMax);

    }

}
