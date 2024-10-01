package com.example.hibernate_project.Repository;

import com.example.hibernate_project.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findByname(String name);
    public List<String> findByemail(String email);
    public List<String> findByage(Integer age);
    public List<Student> findByAGeGreaterThan(Integer age);

    List<Student> findByemailContaining(String email);
    List<Student> findByAgeBetween(int startAge, int endAge);

    Long countByAge(Integer age);
    Long countByAgeGreaterThan(Integer age);
    Long countByAgeBetween(Integer startAge, Integer endAge);

    @Query("SELECT SUM(s.age) FROM Student s")
    Integer findSumofAge();
}
