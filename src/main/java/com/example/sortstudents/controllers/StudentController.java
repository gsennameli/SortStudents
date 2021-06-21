package com.example.sortstudents.controllers;


import com.example.sortstudents.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/sort")
public class StudentController {
    private StudentService studentService;

    @GetMapping("/{quantityStudents}")
    public ResponseEntity getSortedStudents(@PathVariable int quantityStudents){
        return new ResponseEntity(studentService.getSortedStudents(quantityStudents), HttpStatus.OK);
    }
}
