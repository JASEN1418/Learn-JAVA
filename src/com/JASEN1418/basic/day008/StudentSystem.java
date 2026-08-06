package com.JASEN1418.basic.day008;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        showUI();
        while (true) {
            System.out.print("请输入操作编号：");
            int k = sc.nextInt();
            sc.nextLine();
            switch (k) {
                case 1 -> add(list, sc);
                case 2 -> remove(list, sc);
                case 3 -> set(list, sc);
                case 4 -> get(list, sc);
                case 5 -> {
                    System.out.println("系统已退出，再见！");
                    sc.close();
                    return;
                }
                default -> System.out.println("无效操作！请输入1-5之间的数字");
            }
            System.out.println("\n");
            showUI();
        }
    }

    public static void showUI() {
        System.out.println("======FengXue学生管理系统======");
        System.out.println("1.增加新学生");
        System.out.println("2.删除学生信息");
        System.out.println("3.修改学生信息");
        System.out.println("4.查询学生信息");
        System.out.println("5.退出系统");
    }

    // 增加学生信息
    public static void add(ArrayList<Student> list, Scanner sc) {
        System.out.println("请分别输入姓名，id，电话号码，年龄，成绩");
        Student s = new Student();
        s.setName(sc.nextLine());
        s.setId(sc.nextLine());
        s.setPhoneNumber(sc.nextLine());
        s.setAge(sc.nextInt());
        sc.nextLine();
        s.setMark(sc.nextInt());
        sc.nextLine();

        int p = 0;
        for (Student student : list) {
            if (student.getId().equals(s.getId())) {
                p = -1;
                break;
            }
        }

        if (p == 0) {
            list.add(s);
            System.out.println("添加成功！");
        } else {
            System.out.println("id" + s.getId() + "已被占用！");
            System.out.println("若需退出请输入0，或者其他任意数字重新添加");
            int temp = sc.nextInt();
            sc.nextLine();
            if (temp == 0) {
                System.out.println("正在退出.....");
                return;
            }
            add(list, sc);
        }
    }

    // 删除学生信息
    public static void remove(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入要删除的学生id");
        String s = sc.nextLine();
        int p = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(s)) {
                p = 1;
                list.remove(i);
                break;
            }
        }
        if (p == 1) {
            System.out.println("删除成功！");
            return;
        } else {
            System.out.println("id" + s + "不存在！");
            System.out.println("若需退出请输入0，或者其他任意数字重新删除");
            int temp = sc.nextInt();
            sc.nextLine();
            if (temp == 0) {
                System.out.println("正在退出.....");
                return;
            }
            remove(list, sc);
        }
    }

    // 修改学生信息
    public static void set(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入要修改学生的id");
        String s = sc.nextLine();
        int p = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(s)) {
                p = 1;
                System.out.println("请输入要修改的内容");
                System.out.println("1.姓名");
                System.out.println("2.电话号码");
                System.out.println("3.年龄");
                System.out.println("4.成绩");
                System.out.println("5.退出");
                int temp = sc.nextInt();
                sc.nextLine();
                while (temp < 1 || temp > 5) {
                    System.out.println("无效操作！请输入1-5之间的数字：");
                    temp = sc.nextInt();
                    sc.nextLine();
                }
                switch (temp) {
                    case 1:
                        System.out.print("请输入新姓名：");
                        list.get(i).setName(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("请输入新电话号码：");
                        list.get(i).setPhoneNumber(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("请输入新年龄：");
                        list.get(i).setAge(sc.nextInt());
                        sc.nextLine();
                        break;
                    case 4:
                        System.out.print("请输入新成绩：");
                        list.get(i).setMark(sc.nextInt());
                        sc.nextLine();
                        break;
                    case 5:
                        System.out.println("正在退出修改.....");
                        return;
                }
                System.out.println("修改成功！最新信息：");
                System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() + "\t\t" +
                        list.get(i).getPhoneNumber() + "\t" + list.get(i).getAge() + "\t\t" + list.get(i).getMark());
                break;
            }
        }
        if (p == 0) {
            System.out.println("id" + s + "不存在！");
            System.out.println("若需退出请输入0，或者其他任意数字重新修改");
            int temp = sc.nextInt();
            sc.nextLine();
            if (temp == 0) {
                System.out.println("正在退出.....");
                return;
            }
            set(list, sc);
        }
    }

    // 查找学生信息
    public static void get(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入要查找学生的id，输入all查询全部");
        String s = sc.nextLine();
        int p = 0;
        System.out.println("id\t姓名\t电话号码\t\t年龄\t成绩\t");
        System.out.println("----------------------------------------");
        if (s.equalsIgnoreCase("all")) {
            p = 1;
            for (Student student : list) {
                System.out.println(student.getId() + "\t" + student.getName() + "\t\t" +
                        student.getPhoneNumber() + "\t" + student.getAge() + "\t\t" + student.getMark());
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().equals(s)) {
                    p = 1;
                    System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() + "\t\t" +
                            list.get(i).getPhoneNumber() + "\t" + list.get(i).getAge() + "\t\t" + list.get(i).getMark());
                    break;
                }
            }
        }
        if (p == 0) {
            System.out.println("id" + s + "不存在！");
            System.out.println("若需退出请输入0，或者其他任意数字重新查询");
            int temp = sc.nextInt();
            sc.nextLine();
            if (temp == 0) {
                System.out.println("正在退出.....");
                return;
            }
            get(list, sc);
        }
    }
}

