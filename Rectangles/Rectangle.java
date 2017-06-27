//Rectangle. Сложность: *. Приоритет: ***.
//Создать классы:
//1. Rectangle (Прямоугольник), содержащий размеры (высоту и ширину), и умеющий подсчитывать свои периметр и площадь.
//2. Rectangles (Прямоугольники), содержащий список прямоугольников, умеющий добавлять новые прямоугольники и подсчитывать их суммарную площадь. Подсказка: реализовать на основании ArrayList.
//3. Клиентский класс RectangleRunner, демонстрирующий работу предыдущих классов.

package oop1;

import java.util.Scanner;

public class Rectangle {
    final int width;
    final int height;

    public Rectangle() {
        this.width = addW();
        this.height = addH();
    }

    public int getPerimeter() {
        return width * 2 + height * 2;
    }

    public int getArea() {
        return width * height;
    }

    private int addW() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввести ширину");
        System.out.print(">>");
        int a = scan.nextInt();
        return a;
    }

    private int addH() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввести высоту");
        System.out.print(">>");
        int a = scan.nextInt();
        return a;
    }
}
