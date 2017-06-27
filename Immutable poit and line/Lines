//Immutable Point, Line. Сложность: *. Приоритет: ***.
//        Создать классы:
//        1. Point (Immutable): double x, double y. Methods: getters .
//        2. Line (Immutable): Point start, Point end. Methods: double getLength( ).
//        3. Lines: ArrayList<Line> lines. Methods: void add(Line line), double sumLength( ), Line longestLine( ).
//
//        Точка и линия должны быть неизменяемыми объектами (Immutable) - все поля final, отсутствуют setters.

package oop2;

import java.util.ArrayList;


public class Lines {
    ArrayList<Line> list = new ArrayList<Line>();

    public void addLine() {
        list.add(new Line());
    }

    double sumLength() {
        double sum = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Line temp = list.get(i);
            sum += temp.getLength();
        }
        System.out.println("Сумма длин линий " + sum);
        return sum;
    }

    public Line getLongestLine() {
        Line longestLine = list.get(0);
        int size = list.size();

        for (int i = 0; i < size-1; i++) {
            Line temp = list.get(i);
            Line temp1 = list.get(i+1);
            if (temp.getLength()>temp1.getLength()){
                longestLine = temp;
            }else{
                longestLine = temp1;
            }
        }
        System.out.println("Наибольшая длина отрезка " + longestLine.getLength());
        return longestLine;
    }

}
