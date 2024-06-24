package com.example.StudentManagmentBackend.service;

import com.example.StudentManagmentBackend.Entity.Student;
import com.example.StudentManagmentBackend.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;

    public void saveorUpdate(Student students) {

        repo.save(students);
    }


    public Iterable<Student> listAll() {
        return  this.repo.findAll();
    }


    public void deleteStudent(String id) {

        repo.deleteById(id);
    }

    public Student getStudentByID(String studentid) {
        return repo.findById(studentid).get();
    }
}
