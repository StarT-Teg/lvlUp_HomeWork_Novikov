public class hW_3_extra {

/*
    Составить описание класса прямоугольников со сторонами, параллельными осям координат.
    Предусмотреть возможность перемещения прямоугольников на плоскости,
    изменение размеров (здесь нужно задать точку, с которой он будет рисоваться (к примеру, верхнюю левую) и также указать размер сторон).
    Также добавьте возможность проверки пересечения двух прямоугольников.
*/


    // Класс hW_3_extra по сути называется Rectangle и является шаблоном для создания прямоуголников
    // Хранит в себе Начальные точки, длину сторон и массив с остальными точками
    // Так как стороны всегда параллельны осям, а длина сторон одинаковая, остальные точки легко вычислить

    int x;
    int y;
    int length;
    int[] rectangle;

    public hW_3_extra(int x, int y, int length) { // x , y точка, от которой на оси координат можно построить прямоугольник

        this.x = x;
        this.y = y;
        this.length = length;

        createRectangle(x, y, length);

    }

    private void createRectangle(int xCreate, int yCreate, int lengthCreate) { // За основу берём верхнюю левую точку

        this.rectangle = new int[8]; // Осюда координаты точек храним в массиве

        rectangle[0] = xCreate; // левый верх
        rectangle[1] = yCreate;

        rectangle[2] = xCreate + lengthCreate; // правый верх
        rectangle[3] = yCreate;

        rectangle[4] = xCreate + lengthCreate; // правый низ
        rectangle[5] = yCreate - lengthCreate;

        rectangle[6] = xCreate; // левый них
        rectangle[7] = yCreate - lengthCreate;

    }

    public void move(String direction, int amount) {

        // Сдвиг по сути пересоздание по новым координатам. Пока не очень удобно реализованы команды

        switch (direction) {
            case "up":
                x = rectangle[0];
                y = rectangle[1] + amount;
                break;
            case "left":
                x = rectangle[0] - amount;
                y = rectangle[1];
                break;
            case "right":
                x = rectangle[0] + amount;
                y = rectangle[1];
                break;
            case "down":
                x = rectangle[0];
                y = rectangle[1] - amount;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }

        createRectangle(x, y, length);

    }

    public void changeSize(int newLength) {

        // Изменение размера так же пересоздаёт фигуру по левой верхней точке

        this.length = newLength;
        createRectangle(x, y, length);

    }

    public void intersection(hW_3_extra newRectangle) {

        // пока что только проверяет, есть пересечения или нет. Планирую добавить вывод точек пересечения

        if (rectangle[1] < newRectangle.rectangle[7] || rectangle[7] > newRectangle.rectangle[1] || rectangle[6] < newRectangle.rectangle[0] || rectangle[0] > newRectangle.rectangle[6]) {
            System.out.println("Пересечений нет!");
        } else {
            System.out.println("Есть пересечения!");
        }

    }


    public void print() {

        // Печать точек фигуры. Пока думаю над форматом

        for (int i = 0; i < rectangle.length; i++) {

            if (i % 2 == 0) {
                System.out.print("(");
                System.out.print(rectangle[i] + ",");
            } else {
                System.out.print(rectangle[i]);
                System.out.print(")");
            }

        }

        System.out.println();

    }


    public static void main(String[] args) {

        hW_3_extra rect1 = new hW_3_extra(0, 0, 2);
        rect1.print();

        hW_3_extra rect2 = new hW_3_extra(0, 4, 2);

        rect1.intersection(rect2);

    }

}
