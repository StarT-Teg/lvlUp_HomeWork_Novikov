import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class hW_1_extra {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Данный код находит все простые числа в промежутке от 2 до n с помощью решета Эрастофена ");
        System.out.println("Введите число n");

        boolean [] m = new boolean[Integer.parseInt(reader.readLine()) + 1]; // Добавляем + 1, чтобы красиво вывести индексы итога

        System.out.println("Массив: ");

        for (int i = 2; i < m.length ; i++){ // ПО ТЗ из псевдокода завязываемся на индексы массива, а не на значения
            m[i] = true;
            System.out.print(i + " ");
        }

        for (int i = 2; i < m.length ; i++){ // Для каждого элемента массива...
            if (m[i]){ // ...если его значение true...
                for (int j = i*i; j < m.length; j+=i){ // ... ставим false всем элементам с индексами по формуле i*i + i
                    m[j] = false;

                }
            }
        }

        System.out.println(); // Для читаемости
        System.out.println(); // Для читаемости
        System.out.println("Из них простые:");

        for (int i = 2; i < m.length; i++) {
            if (m[i]){
                System.out.print(i + " ");
            }
        }
    }
}
