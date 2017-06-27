//Immutable Point, Line. Сложность: *. Приоритет: ***.
//        Создать классы:
//        1. Point (Immutable): double x, double y. Methods: getters .
//        2. Line (Immutable): Point start, Point end. Methods: double getLength( ).
//        3. Lines: ArrayList<Line> lines. Methods: void add(Line line), double sumLength( ), Line longestLine( ).
//
//        Точка и линия должны быть неизменяемыми объектами (Immutable) - все поля final, отсутствуют setters.

package oop2;

import java.util.Scanner;


public class Point {

    final double x;
    final double y;

    public Point() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввести значение x");
        System.out.println(">>");
        this.x = scan.nextDouble();
        System.out.println("Ввести значение y");
        System.out.println(">>");
        this.y = scan.nextDouble();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
