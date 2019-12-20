package com.testautomation.firstlevel.Fundamentals.MainTask;

import java.util.Scanner;

public class FundamentalsMainTaskFirstQuest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please, enter your name: ");
    String name = input.next();
    System.out.println("Hello, " + name + "!");
  }
}
