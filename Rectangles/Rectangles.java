//Rectangle. Сложность: *. Приоритет: ***.
//Создать классы:
//1. Rectangle (Прямоугольник), содержащий размеры (высоту и ширину), и умеющий подсчитывать свои периметр и площадь.
//2. Rectangles (Прямоугольники), содержащий список прямоугольников, умеющий добавлять новые прямоугольники и подсчитывать их суммарную площадь. Подсказка: реализовать на основании ArrayList.
//3. Клиентский класс RectangleRunner, демонстрирующий работу предыдущих классов.

package oop1;

import java.util.ArrayList;

public class Rectangles {

    ArrayList<Rectangle> list = new ArrayList<Rectangle>();

    public void addRectangle() {
        list.add(new Rectangle());
    }

    public void getArea() {
        int area = 0;
        int elements = list.size();

        for (int i = 0; i < elements; i++) {
            Rectangle temp = list.get(i);
            area += temp.getArea();
        }
        System.out.println("Общая площадь равна " + area);
    }

    public int getLastRectangleArea() {
        int lastElement = list.size() - 1;
        Rectangle temp = list.get(lastElement);
        return temp.getArea();
    }

    public int getLastRectanglePerimeter() {
        int lastElement = list.size() - 1;
        Rectangle temp = list.get(lastElement);
        return temp.getPerimeter();
    }

}
