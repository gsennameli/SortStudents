package com.example.sortstudents.services;

import com.example.sortstudents.entities.Student;
import com.example.sortstudents.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class StudentServiceImp implements StudentService{

    private StudentRepository studentRepository;

    @Override
    public List<Student> getSortedStudents(int quantityOfSortedStudents) {
        List<Student> allStudents = studentRepository.findAll();
        Collections.shuffle(allStudents);

        List<Student> sortedStudents = allStudents.stream()
                                                    .limit(quantityOfSortedStudents)
                                                    .collect(Collectors.toList());
        return sortedStudents;
    }
}
