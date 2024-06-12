package org.example._2024_06_10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.*;

//todo
public class Main {

    public static void main(String[] args) {
        Door d2 = new Door(123, 654, Color.WHITE);
        Door d1 = new Door(123, 654, Color.BLACK);
        Door d3 = new Door(134, 6564, Color.WHITE);
        Door d4 = new Door(123, 34, Color.BLACK);
        Door d5 = new Door(1243, 665, Color.WHITE);
        Door d6 = new Door(1209, 651, Color.WHITE);

        Set<Door> doors = new TreeSet<>(new WidthComparator());

        doors.add(d1);

        doors.add(d3);
        doors.add(d4);
        doors.add(d5);
        doors.add(d6);
        doors.add(d2);
        System.out.println(doors);
    }
}

@ToString
@Getter
@AllArgsConstructor
class Door implements Comparable<Door> {
    private double length;
    private double width;
    private Color color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return Double.compare(length, door.length) == 0
                && Double.compare(width, door.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public int compareTo(Door o) {
        return (int) (this.length - o.length);
    }
}

enum Color {
    WHITE, BLACK;
}

class WidthComparator implements Comparator<Door> {

    @Override
    public int compare(Door o1, Door o2) {
        return (int) (o1.getWidth() - o2.getWidth());
    }
}