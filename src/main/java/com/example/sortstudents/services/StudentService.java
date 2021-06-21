package com.example.sortstudents.services;

import com.example.sortstudents.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getSortedStudents(int quantityOfSortedStudents);
}
