package com.company.controller;

import com.company.model.Student;
import com.company.service.ManageServiceImpl;

import java.util.List;

public class StudentController {
    ManageServiceImpl manageService = new ManageServiceImpl();
    public List<Student> showListStudent(){
        return manageService.findAll();
    }
    public void createStudent(Student student){
        manageService.save(student);
    }
    public void deleteStudent(int id){
        manageService.deleteById(id);
    }
    public Student detailStudent(int id){
       return manageService.findById(id);
    }
    public void editStudent(int id, Student student){
        Student student1 = manageService.findById(id);
        student1.setName(student.getName());
        student1.setAge(student.getAge());
        student1.setAvg(student.getAvg());
        manageService.deleteById(id);
        manageService.save(student1);
    }
}
