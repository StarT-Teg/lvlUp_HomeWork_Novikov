import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class hW_2_3 {

    // Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран. Примеры работы программы:

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Данный код проверяет, попало ли случайно выбранное целое число из отрезка [5;155] в интервал (25;100) и сообщает результат");


        for (String i = "y"; i.equals("y"); ) {

            int rnd = new Random().nextInt(((155 - 5) + 1) + 5);

            if (rnd > 25 && rnd < 100) {
                System.out.println("Число " + rnd + " содержится в интервале (25,100)");
            } else {
                System.out.println("Число " + rnd + " не содержится в интервале (25,100)");
            }

            System.out.println("Ещё раз? y|n"); // Повторялочка
            if (reader.readLine().equals("n")) {
                i = "n";
            }

        }

    }
}
