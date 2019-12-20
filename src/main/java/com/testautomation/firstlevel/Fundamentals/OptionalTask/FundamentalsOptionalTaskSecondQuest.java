package com.testautomation.firstlevel.Fundamentals.OptionalTask;

import java.util.Scanner;

public class FundamentalsOptionalTaskSecondQuest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter amount of numbers:");
    int AmountOfNumbers = scanner.nextInt();
    String Numbers[] = new String[AmountOfNumbers];
    System.out.println("Enter " + AmountOfNumbers + " numbers: ");
    for (int i = 0; i < AmountOfNumbers; i++) {
      Numbers[i] = Integer.toString(scanner.nextInt());
    }
    for (int i = 0; i < Numbers.length; i++) {
      for (int j = 0; j < Numbers.length - 1 - i; j++) {
        if (Numbers[j].length() > Numbers[j + 1].length()) {
          String str = Numbers[j];
          Numbers[j] = Numbers[j + 1];
          Numbers[j + 1] = str;
        }
      }
    }
    System.out.println("Your numbers in ascending order of it length: ");
    for (String NumbersInAscendingOrder : Numbers) {
      System.out.println(NumbersInAscendingOrder);
    }
  }
}
