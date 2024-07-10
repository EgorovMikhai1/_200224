package org.example._2024_07_10.taski;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Department {
    private String name;
    private String head;
    private List<Course> courses;
}
