package hW_4_extra;

import com.github.javafaker.Faker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Library {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Faker faker = new Faker();

        Reader[] libraryReaders = new Reader[10];

        for (int i = 0; i < libraryReaders.length; i++) { // Наполняем библиотеку пользователями

            libraryReaders[i] = new Reader(
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.name().nameWithMiddle(),
                    faker.idNumber().valid(),
                    faker.educator().course(),
                    faker.date().birthday(),
                    faker.phoneNumber().phoneNumber()
            );
        }

        libraryReaders[2].takeBook(2); // Тест на взятие кол-ва книг

        System.out.println("Тест на взятие книг по названию. Введите названия:");
        for (ArrayList<String> books = new ArrayList<String>(); ; ) { // Тест на взятие книг по названию

            String s = reader.readLine();

            if (s.isEmpty()) {
                libraryReaders[1].takeBook(books);
                break;
            } else {
                books.add(s);
            }
        }

        System.out.println();
        System.out.println("Тест на взятие книг по массиву класса Book. Массив заполняется автоматически");
        Book[] bookShelf = new Book[3];
        for (int i = 0; i < bookShelf.length; i++) { // Тест на взятие книг по массиву класса Book.

            bookShelf[i] = new Book(
                    faker.book().author(),
                    faker.book().title());
        }

        libraryReaders[0].takeBook(bookShelf);

    }
}
