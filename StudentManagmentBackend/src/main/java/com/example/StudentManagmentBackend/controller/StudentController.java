package com.example.StudentManagmentBackend.controller;

import com.example.StudentManagmentBackend.Entity.Student;
import com.example.StudentManagmentBackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")
public class StudentController {


    @Autowired
    private StudentService studentServices;
    @PostMapping(value = "/save")
    public String saveStudent(@RequestBody Student students) {

 studentServices.saveorUpdate(students);
        return students.get_id();
    }

    @GetMapping(value = "/getAll")
    public Iterable<Student> getStudent() {
        return studentServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Student update(@RequestBody Student student, @PathVariable(name = "id") String _id) {


       student.set_id(_id);
        studentServices.saveorUpdate(student);
        return student;
    }


    @DeleteMapping(value = "/delete/{id}")
    public void deleteStudent(@PathVariable(name = "id") String _id) {
        studentServices.deleteStudent(_id);
    }

    @RequestMapping(value = "/student/{id}")
    public Student getStudent(@PathVariable(name = "id")String studentid) {
       return studentServices.getStudentByID(studentid);
    }
}
