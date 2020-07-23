package hW_5_3;

import java.util.Random;

public class Calculate {

    private static Point createPoint() {
        return new Point(new Random().nextInt((9 + 1)), new Random().nextInt((9 + 1)), "A");
    }

    public static void compateTriangles(Triangle[] triangles) {

        double tmp = triangles[0].calculateSquare();

        for (Triangle triangle : triangles) {
            if (triangle.calculateSquare() > tmp) {
                tmp += triangle.calculateSquare();
            }
        }
        System.out.println(String.format("Площадь самого большого треугольника = " + tmp));
    }


    public static void main(String[] args) {

        // Создаём треугольники по случайным точкам
        NewTriangle1 triang1 = new NewTriangle1(createPoint(), createPoint(), createPoint(), "triang1");
        NewTriangle2 triang2 = new NewTriangle2(createPoint(), createPoint(), createPoint(), "triang2");
        NewTriangle3 triang3 = new NewTriangle3(createPoint(), createPoint(), createPoint(), "triang3");

        compateTriangles(new Triangle[]{triang1, triang2, triang3});

    }

}
