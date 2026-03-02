package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        
        do {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo tên");
            System.out.println("4. Xóa sinh viên theo MSSV");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudentByName();
                    break;
                case 4:
                    deleteStudentByMssv();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình. Hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        } while (choice != 0);
    }

    // --- Các phương thức chức năng ---

    static void addStudent() {
        System.out.print("Nhập MSSV: ");
        String mssv = scanner.nextLine();
        System.out.print("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập điểm GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        Student newStudent = new Student(mssv, name, gpa);
        studentList.add(newStudent);
        System.out.println("-> Thêm sinh viên thành công!");
    }

    static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("-> Danh sách đang trống!");
            return;
        }
        System.out.println("--- Danh sách sinh viên ---");
        for (Student s : studentList) {
            System.out.println(s.toString());
        }
    }

    static void searchStudentByName() {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String searchName = scanner.nextLine().toLowerCase();
        boolean found = false;

        System.out.println("--- Kết quả tìm kiếm ---");
        for (Student s : studentList) {
            // Kiểm tra
            if (s.getName().toLowerCase().contains(searchName)) {
                System.out.println(s.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("-> Không tìm thấy sinh viên nào có tên: " + searchName);
        }
    }

    static void deleteStudentByMssv() {
        System.out.print("Nhập MSSV sinh viên cần xóa: ");
        String targetMssv = scanner.nextLine();
        boolean removed = false;

        // Duyệt danh sách để tìm và xóa
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMssv().equals(targetMssv)) {
                studentList.remove(i);
                removed = true;
                System.out.println("Đã xóa sinh viên thành công!");
                break;
            }
        }

        if (!removed) {
            System.out.println("-> Không tìm thấy MSSV: " + targetMssv);
        }
    }
}