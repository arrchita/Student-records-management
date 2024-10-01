package com.example.hibernate_project.Controller;

import com.example.hibernate_project.Model.Student;
import com.example.hibernate_project.Service.StudentService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping()
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/id/{id}")
    public Student getById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/id/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "Student deleted";
    }
    @PostMapping("/save")
        public Student createStudent(@RequestBody Student student){
            return studentService.saveStudent(student);
        }
}
