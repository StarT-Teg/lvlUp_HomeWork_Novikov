import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class hW_2_5 {

    // 5. В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
    // Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Данный код форматирует три введённых с клавиатуры числа в возрастающем порядке.");
        System.out.println();
        System.out.println("Введите три попарно неравных числа:");

        int[] m = {Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())};

        if (m[0] != m[1] && m[0] != m[2]) {

            Arrays.sort(m);

            System.out.println("Массив в порядке возрастания: ");
            System.out.println();

            for (int i : m) {
                System.out.print(i + " ");
            }

        } else {
            System.out.println("В числах есть пары!");
        }

    }

}
