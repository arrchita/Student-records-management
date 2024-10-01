package com.example.hibernate_project.Repository;

import com.example.hibernate_project.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    //Dynamic Query Methods
    public List<Student> findByname(String name);
    public List<String> findByemail(String email);
    public List<String> findByage(Integer age);
    public List<Student> findByAGeGreaterThan(Integer age);

    // Find by email containing certain text (like)
    List<Student> findByemailContaining(String email);

    // Find by age between certain values
    List<Student> findByAgeBetween(int startAge, int endAge);

    Long countByAge(Integer age);

    // Count students with marks greater than a specific value
    Long countByAgeGreaterThan(Integer age);

    // Count students of a certain age range
    Long countByAgeBetween(Integer startAge, Integer endAge);

    // Find SUM of age
    @Query("SELECT SUM(s.age) FROM Student s")
    Integer findSumofAge();

    // Find MIN (minimum) age
    @Query("SELECT MIN(s.age) FROM Student s")
    Integer findMinAge();

    // Find MAX (maximum) age
    @Query("SELECT MAX(s.age) FROM Student s")
    Integer findMaxAge();

    // Find Top 3 students with the highest age
    List<Student> findTop3ByOrderByAgeDesc();
}
