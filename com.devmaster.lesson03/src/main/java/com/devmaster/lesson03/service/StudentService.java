package com.devmaster.lesson03.service;

import com.devmaster.lesson03.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    // Mock data
    List<Student> students = new ArrayList<Student>();
    public StudentService() {
        students.addAll(
            Arrays.asList(
                    new Student(1L,"Devmaster 1",20,"None","Số 25 VNP","0978611889","Chungtrinhj@gmail.com")
                    ,new Student(2L,"Devmaster 2",21,"None","Số 25 VNP","0978611889","Chungtrinhj@gmail.com")
                    ,new Student(3L,"Devmaster 3",24,"None","Số 25 VNP","0978611889","Chungtrinhj@gmail.com")
                    ,new Student(4L,"Devmaster 4",22,"None","Số 25 VNP","0978611889","Chungtrinhj@gmail.com")
            )
        );
    }

    // Lấy toàn bộ danh sách sinh viên
    public List<Student> getStudents() {
       return students;
    }

    // Lâý sinh viên theo id
    public Student getStudentById(Long id) {
        return  students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }

    // Thêm mới một sinh viên
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    // Cập nhật thông tin sinh viên
    public Student updateStudent(Long id, Student student) {
        Student oldStudent = getStudentById(id);
        System.out.println(id);
        System.out.println(student.toString());
        if(oldStudent == null) {
            return null;
        }

        students.forEach(item->{
            if(item.getId().equals(id)) {
                item.setName(student.getName());
                item.setAge(student.getAge());
                item.setAddress(student.getAddress());
                item.setEmail(student.getEmail());
                item.setPhone(student.getPhone());
                item.setGender(student.getGender());
            }
        });
        return student;
    }

    // Xóa thông tin sinh viên
    public boolean deleteStudent(Long id) {
        Student student = getStudentById(id);
        return students.remove(student);
    }
}
