public class hW_2_9 {

    // Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

    public static void main(String[] args) {

        System.out.println("Данный код выводит на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….");

        int tmp = 2;

        for (int i = 0; i < 20; i++) {

            System.out.println(tmp);
            tmp *= 2;

        }

    }
}
