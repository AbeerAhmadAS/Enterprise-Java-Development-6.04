package com.ironhack.studentcatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class StudentGrade {
    private String studentName;
    private Integer age;
    private Integer grade;

    public StudentGrade(String studentName, Integer age, Integer grade) {
        this.studentName = studentName;
        this.age = age;
        this.grade = grade;
    }
}
