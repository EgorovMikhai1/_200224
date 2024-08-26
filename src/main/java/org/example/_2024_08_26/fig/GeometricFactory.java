package org.example._2024_08_26.fig;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeometricFactory {
    public static List<Geometric> createGeometricShapes() {
        List<Geometric> shapes = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            shapes.add(new Line(randomDouble()));
        }

        for (int i = 0; i < 20; i++) {
            shapes.add(new Circle(randomDouble()));
        }

        for (int i = 0; i < 30; i++) {
            shapes.add(new Triangle(randomDouble(), randomDouble(), randomDouble()));
        }

        for (int i = 0; i < 50; i++) {
            double side = randomDouble();
            shapes.add(new Square(side, side));
        }

        return shapes;
    }

    private static double randomDouble() {
        Random random = new Random();
        return 1.0 + (10.0 - 1.0) * random.nextDouble();
    }
}