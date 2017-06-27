//Immutable Point, Line. Сложность: *. Приоритет: ***.
//        Создать классы:
//        1. Point (Immutable): double x, double y. Methods: getters .
//        2. Line (Immutable): Point start, Point end. Methods: double getLength( ).
//        3. Lines: ArrayList<Line> lines. Methods: void add(Line line), double sumLength( ), Line longestLine( ).
//
//        Точка и линия должны быть неизменяемыми объектами (Immutable) - все поля final, отсутствуют setters.

package oop2;


public class Line {

    final Point start = new Point();
    final Point end = new Point();


    public double getLength() {
        double a = end.getY() - start.getY();
        double b = end.getX() - start.getX();

        double length = Math.pow(a, 2) + Math.pow(b, 2);
        return Math.sqrt(length);
    }
}


