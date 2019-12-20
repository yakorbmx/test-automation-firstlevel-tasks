package com.testautomation.firstlevel.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassesMainTaskRunner {
  public static void main(String[] args) {
    List<Student> array = new ArrayList<>();
    createListStudent(array);
    listOfStfStudents(array);
    System.out.println();
    listOfUirStudents(array);
    System.out.println();
    coursesList(array);
    System.out.println();
    bornAfterList(array);
    System.out.println();
    currentGroupList(array);
  }

  private static void createListStudent(List<Student> array) {
    array.add(
        new Student(
            "Vakar",
            "Darya",
            "Sergeevna",
            1999,
            "Vitebsk",
            "+375299977123",
            "Uir",
            4,
            "Uir-3"));
    array.add(
        new Student(
            "Gavrilenko",
            "Yaroslav",
            "Vladimirovich",
            1997,
            "Vitebsk",
            "+375333613554",
            "Stf",
            3,
            "11902114"));
    array.add(
        new Student(
            "Karpenko",
            "Stepan",
            "Andreevich",
            2001,
            "Minsk",
            "+375291234567",
            "Uir",
            2,
            "Uir-3"));
    array.add(
        new Student(
            "Smirnova",
            "Anastasiya",
            "Alekseevna",
            1998,
            "Gomel",
            "+375447992760",
            "Stf",
            1,
            "11902114"));
    array.add(
        new Student(
            "Kopatov",
            "Stanislav",
            "Dmitrievich",
            1995,
            "Borisov",
            "+375441247543",
            "Stf",
            5,
            "11902114"));
  }

  private static void listOfStfStudents(List<Student> array) {
    String stfFaculty = "Stf";
    System.out.println("List of Stf faculty students: ");
    for (Student student : array) {
      if (stfFaculty.equals(student.getstudentFaculty())) System.out.println(student);
    }
  }

  private static void listOfUirStudents(List<Student> array) {
    String uirFaculty = "Uir";
    System.out.println("List of Uir faculty students: ");
    for (Student student : array) {
      if (uirFaculty.equals(student.getstudentFaculty())) System.out.println(student);
    }
  }

  private static void coursesList(List<Student> array) {
    System.out.println("List of students of each course: ");
    for (Student student : array) {
      switch (student.getstudentCourse()) {
        case 1:
          System.out.println("1st course students: " + student);
          break;
        case 2:
          System.out.println("2nd course students: " + student);
          break;
        case 3:
          System.out.println("3rd course students: " + student);
          break;
        case 4:
          System.out.println("4th course students: " + student);
          break;
        case 5:
          System.out.println("5th course students: " + student);
          break;
        default:
          System.out.println("Incorrect course!");
      }
    }
  }

  private static void bornAfterList(List<Student> array) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter year of birth needed to sort:");
    int currentYearOfBirth = scanner.nextInt();
    System.out.println("List of students born after " + currentYearOfBirth + " year: ");
    for (Student student : array) {
      if (student.getstudentDateOfBirth() > currentYearOfBirth) System.out.println(student);
    }
  }

  private static void currentGroupList(List<Student> array) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter group: ");
    String group = scanner.next();
    System.out.println("List of students of " + group + " group: ");
    for (Student student : array) {
      if (group.equals(student.getstudentGroup())) System.out.println(student);
    }
  }
}
