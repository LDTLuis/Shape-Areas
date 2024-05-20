package application;

import entities.*;
import enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle, Circle, Square or Triangle (r/c/s/t)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));

            } else if (ch == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));

            } else if (ch == 's'){
                System.out.print("Square: ");
                double value = sc.nextDouble();
                list.add(new Square(color, value));

            } else {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Triangle(color, width, height));
            }
        }

        System.out.println();
        System.out.println("Shape Areas: ");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }


        sc.close();
    }
}
