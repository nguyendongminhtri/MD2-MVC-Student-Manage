package com.company.view;

import com.company.controller.StudentController;
import com.company.model.Student;

import java.util.Scanner;

public class StudentView {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        public void formCreateStudent(){
            boolean checkCreate = true;
            while (checkCreate){
                System.out.println("Nhập vào số thứ tự của học viên: ");
                int id = scanner.nextInt();
                System.out.println("Nhập vào tên của học viên: ");
                String name = scanner.next();
                System.out.println("Nhập vào tuổi của học viên: ");
                int age = scanner.nextInt();
                System.out.println("Nhập vào điểm trung bình của học viên: ");
                float avg = scanner.nextFloat();
                Student student = new Student(id, name, age,avg);
                studentController.createStudent(student);
                System.out.println("Nhập một phím bất kì để tạo dữ liệu tiếp - Nhập QUIT để thoát khỏi chương trình");
                String enterOrQuit = scanner.next();
                if(enterOrQuit.equalsIgnoreCase("quit")){
                    new Main();
                }
            }
        }
        public void manageStudentList(){
            System.out.println("STT---NAME---AGE---AVG");
            System.out.println("Size == "+studentController.showListStudent().size());
            for(int i=0; i<studentController.showListStudent().size();i++){
                System.out.println(" "+studentController.showListStudent().get(i).getId()
                        +"   "+studentController.showListStudent().get(i).getName()+"   "+studentController.showListStudent().get(i).getAge()
                        +"   "+studentController.showListStudent().get(i).getAvg());

            }
            System.out.println("Nhập vào Quit để quay lại Menu");
            String enterOrQuit = scanner.next();
            if(enterOrQuit.equalsIgnoreCase("quit")){
                new Main();
            }
        }
        public void deleteStudentById(){
            boolean checkDelete = true;
            while (checkDelete){
                System.out.println("Nhập vào số thứ tự để xóa: ");
                int id = scanner.nextInt();
                studentController.deleteStudent(id-1);
                System.out.println("Delete Success!");
                System.out.println("Nhập phím bất kì để xóa tiếp hoặc quit để quay lại Menu");
                String enterOrQuit = scanner.next();
                if(enterOrQuit.equalsIgnoreCase("quit")){
                    new Main();
                }
            }

        }
    public void detailStudentById(){
        boolean checkDetail = true;
        while (checkDetail){
            System.out.println("Nhập vào số thứ tự để hiển thị 1 student : ");
            int id = scanner.nextInt();

            Student student = studentController.detailStudent(id-1);
            System.out.println(" "+student.getId()
                    +"   "+student.getName()+"   "+student.getAge()
                    +"   "+student.getAvg());
            System.out.println("Nhập phím bất kì để xóa tiếp hoặc quit để quay lại Menu");
            String enterOrQuit = scanner.next();
            if(enterOrQuit.equalsIgnoreCase("quit")){
                new Main();
            }
        }

    }
    public void editStudent(){
//        boolean checkDetail = true;

            System.out.println("Nhập vào số thứ tự để sửa 1 student : ");
            int id = scanner.nextInt();
        System.out.println("Nhập vào tên của học viên: ");
        String name = scanner.next();
        System.out.println("Nhập vào tuổi của học viên: ");
        int age = scanner.nextInt();
        System.out.println("Nhập vào điểm trung bình của học viên: ");
        float avg = scanner.nextFloat();
        Student student = new Student(id, name, age,avg);
        studentController.editStudent(id-1,student);
        System.out.println("Edit success!");
            System.out.println("Nhập phím bất kì để xóa tiếp hoặc quit để quay lại Menu");
            String enterOrQuit = scanner.next();
            if(enterOrQuit.equalsIgnoreCase("quit")){
                new Main();
            }


    }
}
