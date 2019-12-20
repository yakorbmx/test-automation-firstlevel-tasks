package com.testautomation.firstlevel.Fundamentals.MainTask;

import java.util.Scanner;

public class FundamentalsMainTaskFourthQuest {
  public static void main(String[] args) {
    System.out.println("Enter amount of numbers: ");
    Scanner scanner = new Scanner(System.in);
    int numbersAmount = scanner.nextInt();
    if (numbersAmount <= 0) {
      System.out.println("Incorrect amount!");
    } else {
      int[] numbers = new int[numbersAmount];
      int sum = 0;
      int mult = 1;
      System.out.println("Enter numbers: ");
      for (int i = 0; i < numbers.length; i++) {
        numbers[i] = scanner.nextInt();
      }
      for (int allArgumentsOfArray : numbers) {
        sum = sum + allArgumentsOfArray;
        mult = mult * allArgumentsOfArray;
      }
      System.out.println("Sum of numbers: " + sum);
      System.out.println("Multiplication of numbers: " + mult);
    }
  }
}
