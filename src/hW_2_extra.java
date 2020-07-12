import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;

public class hW_2_extra {

    // Написать игру виселица.
    // Программа должна случайно выбирать какое-то слово из заданного словаря с заданными значениями. Т.е. набор слов вы сами сформировали.
    // Далее пользователь может вводить буквы и если он угадал, то отображать загаданное слово в виде: ***a***a**и.
    // Также можно отобразить список всех букв, которые ввел пользователь.
    // Количество попыток зависит от длины слова и равняется ее половине (округленную в большую сторону).

    public static String[] vocabularyFill(String[] voc) { // Метод наполняет словарь

        for (int i = 0; i < voc.length; i++) { // Наполняю словом ПРИМЕР с добавлением номера позиции в конце
            voc[i] = "Пример" + i;
        }
        return voc;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] vocabulary = new String[10]; // Словарь
        vocabularyFill(vocabulary);

        System.out.println("Данный код выбирает какое-то слово из заданного словаря, а задача пользователя его угадать");
        System.out.println();
        System.out.println("Список слов из словаря:");

        for (String s : vocabulary) {
            System.out.println(s);
        }

        System.out.println();

        String win = vocabulary[new Random().nextInt((9 + 1))]; // Случайное слово из словаря
        int counter = (int) Math.ceil((double) win.length() / 2); // Кол-во попыток. Сначала расширил до double, чтобы не потерять дробь для ceil


        HashMap<Character, String> tryHarder = new HashMap<>(); // Здесь храним слово, которое угадывает пользователь
        char[] parseWin = win.toLowerCase().toCharArray(); // Занижаем слово и парсим на символы
        for (char c : parseWin) { // Добавляем символы слова в массив
            tryHarder.put(c, "*");
        }

        System.out.println("У вас есть " + counter + " попытки, чтобы угадать слово целиком!");


        for (int i = 0; i < counter; i++) { // Угадываем по кол-ву попыток

            System.out.println("Введите букву");

            char letter = reader.readLine().toLowerCase().charAt(0); // Считываем букву. Если заглавная, занижаем)

            if (letter == "d".charAt(0)) {
                System.out.println("DEBUG. Ответ = " + win);

            } else {
                for (char c : parseWin) { // Сравниваем с массивом букв слова
                    if (c == letter) { // Если угадали, заменяем все звёздочки в слове на буквы
                        tryHarder.replace(c, "*", String.valueOf(c));
                    }

                    if (letter == parseWin[0]) {
                        tryHarder.replace(letter, String.valueOf(letter).toUpperCase());
                    }

                }

                System.out.println("Загаданное слово:");

                for (char c : parseWin) { // Сравниваем с массивом букв слова

                    System.out.print(tryHarder.get(c));

                }

                System.out.println();
            }


        }
    }
}
