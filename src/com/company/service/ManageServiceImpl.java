package com.company.service;

import com.company.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ManageServiceImpl implements IManageService{
   public static List<Student> studentList = new ArrayList<>();
   static {
       studentList.add(new Student(1, "Lan", 16, 9.9f));
       studentList.add(new Student(2, "Trung", 14, 1.3f));
       studentList.add(new Student(3, "Tú Anh", 15, 8.8f));
   }
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteById(int id) {
        studentList.remove(id);
    }

    @Override
    public Student findById(int id) {
        return studentList.get(id);
    }
}
