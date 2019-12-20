package com.testautomation.firstlevel.Classes;

public class Student {
  private static int i = 0;
  private int studentID;
  private int studentCourse;
  private int studentDateOfBirth;
  private String studentSurname;
  private String studentName;
  private String studentLastname;
  private String studentAdress;
  private String studentPhoneNumber;
  private String studentFaculty;
  private String studentGroup;

  public int getStudentID() {
    return studentID;
  }

  public void setstudentID(int studentID) {
    this.studentID = studentID;
  }

  public String getstudentLastname() {
    return studentLastname;
  }

  public void setstudentLastname(String studentLastname) {
    this.studentLastname = studentLastname;
  }

  public String getstudentName() {
    return studentName;
  }

  public void setstudentName(String studentName) {
    this.studentName = studentName;
  }

  public String getstudentSurname() {
    return studentSurname;
  }

  public void setstudentSurname(String studentSurname) {
    this.studentSurname = studentSurname;
  }

  public int getstudentDateOfBirth() {
    return studentDateOfBirth;
  }

  public void setstudentDateOfBirth(int studentDateOfBirth) {
    this.studentDateOfBirth = studentDateOfBirth;
  }

  public String getstudentAdress() {
    return studentAdress;
  }

  public void setstudentAdress(String studentAdress) {
    this.studentAdress = studentAdress;
  }

  public String getstudentPhoneNumber() {
    return studentPhoneNumber;
  }

  public void setstudentPhoneNumber(String studentPhoneNumber) {
    this.studentPhoneNumber = studentPhoneNumber;
  }

  public String getstudentFaculty() {
    return studentFaculty;
  }

  public void setstudentFaculty(String studentFaculty) {
    this.studentFaculty = studentFaculty;
  }

  public int getstudentCourse() {
    return studentCourse;
  }

  public void setstudentCourse(int studentCourse) {
    this.studentCourse = studentCourse;
  }

  public String getstudentGroup() {
    return studentGroup;
  }

  public void setstudentGroup(String studentGroup) {
    this.studentGroup = studentGroup;
  }

  public Student(
      String studentLastname,
      String studentName,
      String studentSurname,
      int studentDateOfBirth,
      String studentAdress,
      String studentPhoneNumber,
      String studentFaculty,
      int studentCourse,
      String studentGroup) {
    i++;
    this.studentID = i;
    this.studentLastname = studentLastname;
    this.studentName = studentName;
    this.studentSurname = studentSurname;
    this.studentDateOfBirth = studentDateOfBirth;
    this.studentAdress = studentAdress;
    this.studentPhoneNumber = studentPhoneNumber;
    this.studentFaculty = studentFaculty;
    this.studentCourse = studentCourse;
    this.studentGroup = studentGroup;
  }

  @Override
  public String toString() {
    return studentID
        + " "
        + studentLastname
        + " "
        + studentName
        + " "
        + studentSurname
        + " "
        + studentDateOfBirth
        + " "
        + studentAdress
        + " "
        + studentPhoneNumber
        + " "
        + studentFaculty
        + " "
        + studentCourse
        + " "
        + studentGroup;
  }
}
