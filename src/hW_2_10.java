import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hW_2_10 {

    //Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Данный код вычисляет факториал натурального числа n, которое пользователь введёт с клавиатуры");
        System.out.println("Введите число n");

        int n = Integer.parseInt(reader.readLine());
        int fac = 1;

        if (n <= 0) {
            System.out.println("Число не натуральное!");
        } else {
            for (int i = n; i > 0; i--) {

                fac *= i;
            }
        }

        System.out.println("Факториал числа " + n + " = " + fac);

    }
}
