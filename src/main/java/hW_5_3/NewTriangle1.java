package hW_5_3;

public class NewTriangle1 extends Triangle {

    public String getName() {
        return name;
    }

    String name;

    public NewTriangle1(Point first, Point second, Point third, String name) {
        super(first, second, third);
        this.name = name;
    }

    @Override
    public double calculateSquare() {

        double distanceAB = points[0].calculateDistance(points[1]);
        double distanceAC = points[0].calculateDistance(points[2]);
        double distanceBC = points[1].calculateDistance(points[2]);

        double p = (distanceAB + distanceAC + distanceBC) / 2;

        return Math.sqrt(p * (p - distanceAB) * (p - distanceAC) * (p - distanceBC));
    }
}