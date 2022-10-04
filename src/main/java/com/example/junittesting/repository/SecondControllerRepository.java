package com.example.junittesting.repository;

import com.example.junittesting.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondControllerRepository extends JpaRepository<Student, Integer> {

}
