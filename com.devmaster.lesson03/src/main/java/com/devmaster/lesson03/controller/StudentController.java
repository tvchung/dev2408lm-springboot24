package com.devmaster.lesson03.controller;

import com.devmaster.lesson03.entity.Student;
import com.devmaster.lesson03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable String id) {
        Long param = Long.parseLong(id);
        return studentService.getStudentById(param);
    }

    @PostMapping("/student-add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student) {
        Long param = Long.parseLong(id);
        return studentService.updateStudent(param, student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable String id) {
        Long param = Long.parseLong(id);
        studentService.deleteStudent(param);
    }
}
