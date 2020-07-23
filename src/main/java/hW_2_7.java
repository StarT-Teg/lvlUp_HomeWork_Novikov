
public class hW_2_7 {

    //Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …

    public static void main(String[] args) {

        System.out.println("Данный код выводит на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …");

        int tmp = 1;

        for (int i = 0; i < 55; i++) {

            System.out.println(tmp);
            tmp += 2;

        }

    }

}
