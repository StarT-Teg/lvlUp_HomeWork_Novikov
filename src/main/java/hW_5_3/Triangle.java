package hW_5_3;

import java.util.Random;

public class Triangle extends Shape {

    public Triangle(Point first, Point second, Point third) {
        super(new Point[]{
                first,
                second,
                third
        });
    }

    @Override
    public double calculateSquare() {
        // super.calculateSquare(); -> вызов метода суперкласса
        // Math.sqrt(p * (p - a) * (p - b) * (p - c))
        return new Random().nextInt(30);
    }
}