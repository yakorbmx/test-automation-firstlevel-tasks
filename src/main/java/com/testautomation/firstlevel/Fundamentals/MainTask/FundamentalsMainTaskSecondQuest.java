package com.testautomation.firstlevel.Fundamentals.MainTask;

import java.util.Scanner;

public class FundamentalsMainTaskSecondQuest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int arraySize = input.nextInt();
    if (arraySize <= 0) {
      System.out.println("Incorrect size!");
    } else {
      int[] arguments = new int[arraySize];
      for (int i = 0; i < arraySize; i++) {
        System.out.println("Enter " + (i + 1) + " argument of array: ");
        arguments[i] = input.nextInt();
      }
      System.out.println("Reverse arguments:");
      for (int i = (arguments.length - 1); i >= 0; i--) {
        System.out.println(arguments[i]);
      }
    }
  }
}
