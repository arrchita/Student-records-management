package com.example.hibernate_project.Service;

import com.example.hibernate_project.Model.Student;
import com.example.hibernate_project.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getAllStudents(){

        return studentRepository.findAll();
    }

    //get student by ID
    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    //save new student
    public Student saveStudent(Student student){

        return studentRepository.save(student);
    }

    //update existing student
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = getStudentById(id);
        if (student != null) {
            student.setId((studentDetails.getId()));
            student.setName((studentDetails.getName()));
            student.setName(studentDetails.getEmail());
            student.setAge(studentDetails.getAge());

            return studentRepository.save(student);
        }
        return null;
    }

    //delete student
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}

