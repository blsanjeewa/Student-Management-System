package com.example.StudentManagmentBackend.Repo;
import com.example.StudentManagmentBackend.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String> {
}
