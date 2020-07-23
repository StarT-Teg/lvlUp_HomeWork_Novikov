package hW_5_3;

// method overloading
// void m(int a, double b)

import java.util.Objects;

// 1. int m(int a, double b)    -
// 2. void m(double b, int a)   +
// 3. void m(int b, double a)   -
// 4. void m(int a, int b)      +
public class Point { // extends Object

    int x; // поле класса (переменная класса, field)
    int y;

    private String name; // A, B, C

    public Point() {
        System.out.println("Constructor Point...");
    }

    Point(int newX) {
        x = newX;
    }

    // Конструктор
    // Он нужен для инициализации полей
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        // this(x, y, "");
    }

    public Point(int x, int y, String name) {
        this(x, y); // вызов конструктора Point(int x, int y)
//        this.x = x;
//        this.y = y;
        this.name = name;
    }

    // Методы
    // <модификатор доступа> <тип возвращаемого значения> <имя метода>(<тип параметра1> <название параматра1>) { тело метода }
    // void - метод ничего не возвращает (т.е. нет результата работы метода)
    protected void printPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }

    // Сигнатура метода - название + параметры (важен порядок параметров и типов)
    // Перегруженный метод (перегрузка, overloading)

    void printPoint(boolean verbose) {
        if (verbose) {
            System.out.println("Координаты точки: (" + x + ", " + y + ")");
        } else {
            printPoint();
        }
    }

    // flip() - я хочу получить новый объект класса Point с -x и -y

    // quadrant
    // 2 | 1
    // - - -
    // 3 | 4
    int quadrant() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        }
        // else { return 0; }
        return 0;
    }

    // p1 (3, 6)
    // p2 (5, 8)

    // Процедурный стиль
    // pointService.calculateDistance(point1, point2);

    // class PointService {
    public double calculateDistance(Point p1, Point p2) {
        double k1 = Math.pow(p1.x - p2.x, 2); //квадрат длины катета
        double k2 = Math.pow(p1.y - p2.y, 2);
        return Math.sqrt(k1 + k2); // sqrt - вычисленые квадратного корня
    }
    // }

    // Инкапсуляция
    // point1.calculateDistance(point2);
    public double calculateDistance(Point p2) {
        double k1 = Math.pow(x - p2.x, 2); //квадрат длины катета
        double k2 = Math.pow(y - p2.y, 2);

        return Math.sqrt(k1 + k2); // sqrt - вычисленые квадратного корня
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        // 1var, instanceof
        // <object> instanceof <ClassName> -> true/false
        // null instanceof <Any class> -> false
        // if (!(o instanceof Point)) return false;

        // 2var
        // Сравнение объекта с null, то всегда будет false
        if (o == null || this.getClass() != o.getClass())
            return false;

        Point other = (Point) o; // Object -> Point -> ClassCastException
        return x == other.x && y == other.y && // NUP
                Objects.equals(name, other.name);
        // name.equals(other.name); // NPE (NullPointerException)
    }

    @Override
    public int hashCode() {
//        int result = 17;
//
//        result = 31 * result + x;
//        result = 31 * result + y;
//        result = 31 * result + name.hashCode();
//
//        return result;
        // return x; если только поле х учавствует в сравнении

        return Objects.hash(x, y, name);
    }

}
