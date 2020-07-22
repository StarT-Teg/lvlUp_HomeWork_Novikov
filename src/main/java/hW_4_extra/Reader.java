package hW_4_extra;

/*Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
        Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
        + takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
        + takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
        - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
        Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".*/

import java.util.ArrayList;
import java.util.Date;

public class Reader {

    private String name;
    private String surname;
    private String patronymic;
    private String ID;
    private String faculty;
    private Date birthday;
    private String phone;
    private ArrayList<String> bookNames = new ArrayList<String>();
    private ArrayList<Book> books = new ArrayList<Book>();
    private int bookCounter;

    public Reader(String name, String surname, String patronymic, String ID, String faculty, Date birthday, String phone) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.ID = ID;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }


    public void takeBook(int amount) { // Считает кол-во взятых книг
        bookCounter += amount;
        System.out.println(surname + " " + name.substring(0, 1) + ". " + patronymic.substring(0, 1) + ". взял " + bookCounter + " книги");
    }

    public void takeBook(ArrayList<String> names) {

        System.out.println(surname + " " + name.substring(0, 1) + ". " + patronymic.substring(0, 1) + ". взял книги: ");

        for (String s : names) {
            bookNames.add(s);
            System.out.print(s + ", ");
            bookCounter += 1;
        }
    }

    public void takeBook(Book[] books) {

        System.out.println(surname + " " + name.substring(0, 1) + ". " + patronymic.substring(0, 1) + ". взял книги: ");

        for (Book book : books) {
            this.books.add(book);
            System.out.print(book.getName() + ", ");
            ;
            bookCounter += 1;
        }
    }

    public void returnBook(int amount) {
        bookCounter -= amount;
        System.out.println(surname + " " + name.substring(0, 1) + ". " + patronymic.substring(0, 1) + ". вернул " + bookCounter + " книги");
    }

    public void returnBook(ArrayList<String> names) {

        System.out.println(surname + " " + name.substring(0, 1) + ". " + patronymic.substring(0, 1) + ". вернул книги: ");

        for (String s : names) {
            bookNames.remove(s);
            System.out.print(s + ", ");
            bookCounter -= 1;
        }
    }

    public void returnBook(Book[] books) {

        System.out.println(surname + " " + name.substring(0, 1) + ". " + patronymic.substring(0, 1) + ". вернул книги: ");

        for (Book book : books) {
            this.books.remove(book);
            System.out.print(book.getName() + ", ");
            ;
            bookCounter -= 1;
        }
    }

}
