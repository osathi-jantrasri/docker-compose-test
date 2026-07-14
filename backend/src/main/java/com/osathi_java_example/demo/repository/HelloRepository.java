package com.osathi_java_example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.osathi_java_example.demo.model.Hello;
import java.util.List;

public interface HelloRepository extends JpaRepository<Hello, Integer> {
    List<Hello> findAll();
}