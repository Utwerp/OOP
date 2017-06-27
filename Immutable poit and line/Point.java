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
