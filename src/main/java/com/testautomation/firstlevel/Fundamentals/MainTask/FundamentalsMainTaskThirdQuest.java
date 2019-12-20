package com.testautomation.firstlevel.Fundamentals.MainTask;

import java.util.Random;
import java.util.Scanner;

/* На момент написания кода не удалось реализовать корректный вывод одного и того же массива в одну строку и с переносом на новую,
поэтому реализован вывод 2х "рандомных" массивов*/

public class FundamentalsMainTaskThirdQuest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter amount of numbers:");
    int numbersAmount = input.nextInt();
    if (numbersAmount <= 0) {
      System.out.println("Incorrect amount!");
    } else {
      int[] array = new int[numbersAmount];
      Random random = new Random();
      System.out.println("All numbers in one line:");
      for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt();
        System.out.print(array[i] + " ");
      }
      System.out.println("\nEach number in new line:");
      for (int j = 0; j < array.length; j++) {
        array[j] = random.nextInt();
        System.out.println(array[j]);
      }
    }
  }
}
