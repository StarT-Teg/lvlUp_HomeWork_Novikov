import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hW_1_4 {
    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Для решения уравнения ax + b = 0 необходимо ввести переменные a и b");

        System.out.println("Введите переменную a");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Введите переменную b");
        int b = Integer.parseInt(reader.readLine());

        System.out.println(a+"x + "+b+" = 0");
        System.out.println("Ответ = " + ((double)-b/a));

    }
}
