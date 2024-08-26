package org.example._2024_08_26.fig;

import lombok.Getter;

import java.util.List;

@Getter
public class GeometricService {

    public static List<Square> findPerfectSquares(List<Geometric> geometries) {
        return null;
    }

    public static List<Circle> findCirclesInMinMaxRadiusRange(List<Geometric> geometries, double minRadius, double maxRadius) {
        return null;
    }

    public static List<Line> findLinesLongerThanLength(List<Geometric> geometries, double length) {
        return null;
    }

    //Метод возвращает список треугольников (класса Triangle), у которых радиус вписанного круга больше среднего радиуса всех кругов в коллекции.
    public static List<Triangle> findTrianglesWithLargerInscribedCircleThanAverage(List<Geometric> geometries) {
        return null;
    }

    public static long countByType(List<Geometric> geometries, Class<? extends Geometric> type) {
        return 0;
    }

    //Метод возвращает список всех квадратов и кругов, у которых стороны (для квадратов) или радиус (для кругов) находятся в заданном диапазоне.
    public static List<Geometric> findSquaresAndCirclesInRange(List<Geometric> geometries, double minValue, double maxValue) {
        return null;
    }
}