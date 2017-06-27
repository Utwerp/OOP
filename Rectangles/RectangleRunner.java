//Rectangle. Сложность: *. Приоритет: ***.
//Создать классы:
//1. Rectangle (Прямоугольник), содержащий размеры (высоту и ширину), и умеющий подсчитывать свои периметр и площадь.
//2. Rectangles (Прямоугольники), содержащий список прямоугольников, умеющий добавлять новые прямоугольники и подсчитывать их суммарную площадь. Подсказка: реализовать на основании ArrayList.
//3. Клиентский класс RectangleRunner, демонстрирующий работу предыдущих классов.

package oop1;

import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangles list = new Rectangles();
        Scanner scan = new Scanner(System.in);
        int x = 1;
        System.out.println("Стартуем.");
        while (x == 1) {
            System.out.println("Создать новый прямоугольник - введи 1");
            System.out.println("Посчитать площадь имеющихся прямоугольников - введи 0");
            System.out.print(">>");
            int temp = scan.nextInt();
            if (temp == 1) {
                list.addRectangle();
                System.out.println("Создан прямоугольник площадью " + list.getLastRectangleArea() + " и периметром " + list.getLastRectanglePerimeter());
            } else if (temp == 0) {
                list.getArea();
                System.out.println("Программа завершена.");
                System.exit(0);
            }
        }
    }
}
