package com.testautomation.firstlevel.Fundamentals.OptionalTask;

import java.util.Scanner;

public class FundamentalsOptionalTaskFirstQuest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter amount of numbers: ");
    int AmountOfNumbers = scanner.nextInt();
    int Numbers[] = new int[AmountOfNumbers];
    int LengthOfNumbers[] = new int[AmountOfNumbers];
    System.out.println("Enter " + AmountOfNumbers + " numbers: ");
    for (int i = 0; i < AmountOfNumbers; i++) {
      Numbers[i] = scanner.nextInt();
      LengthOfNumbers[i] = (Numbers[i] + "").length();
    }
    int MaximalLength = LengthOfNumbers[0];
    int MinimalLength = LengthOfNumbers[0];
    int longest = 0;
    int shortest = 0;
    for (int i = 1; i < AmountOfNumbers; i++) {
      int j = LengthOfNumbers[i];
      if (MinimalLength > j) {
        MinimalLength = j;
        shortest = i;
      } else {
        if (MaximalLength < j) {
          MaximalLength = j;
          longest = i;
        }
      }
    }
    System.out.println(
        "The shortest number is: " + Numbers[shortest] + " It's length: " + MinimalLength);
    System.out.println(
        "The longest number is: " + Numbers[longest] + " It's length: " + MaximalLength);
  }
}
