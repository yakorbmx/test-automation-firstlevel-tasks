package com.testautomation.firstlevel.Collections.OptionalTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CollectionsOptionalTask {
  public static void main(String[] args) throws FileNotFoundException {
    List<String> poem = new ArrayList<>();
    reversedNumber();
    poemSortedByLengthOfLines(poem);
    reversedLinesFromFile();
  }

  public static void reversedNumber() {
    System.out.print("Enter number: ");
    Stack stackForReversedNumber = new Stack();
    char userNumber[] = new Scanner(System.in).next().toCharArray();
    for (int i = 0; i < userNumber.length; i++) stackForReversedNumber.push(userNumber[i]);
    String stringToReverseUsersNumber = "";
    while (!stackForReversedNumber.isEmpty())
      stringToReverseUsersNumber += stackForReversedNumber.pop();
    try {
      int reversedNumber = Integer.parseInt(stringToReverseUsersNumber);
      System.out.println("Reversed number: " + reversedNumber);
    } catch (Exception exc) {
      System.out.println("Error!");
    }
  }

  public static void poemSortedByLengthOfLines(List<String> poem) {
    poem.add("Вы помните,");
    poem.add("Вы всё, конечно, помните,");
    poem.add("Как я стоял,");
    poem.add("Приблизившись к стене,");
    poem.add("Взволнованно ходили вы по комнате");
    poem.add("И что-то резкое");
    poem.add("В лицо бросали мне.");
    System.out.println("Poem in normal view: " + poem);
    Collections.sort(poem, Comparator.comparing(String::length));
    System.out.println("Poem sorted by length of lines: " + poem);
  }

  public static void reversedLinesFromFile() throws FileNotFoundException {
    Scanner scanner =
        new Scanner(
            new File("D:\\projects\\JAVA\\JavaCollections\\OptionalTask\\fileForScanInTask.txt"));
    Stack<String> stackForReverseLinesFromFile = new Stack();
    while (scanner.hasNextLine()) stackForReverseLinesFromFile.push(scanner.nextLine());
    System.out.println("Reversed lines from file: ");
    while (!stackForReverseLinesFromFile.isEmpty())
      System.out.println(stackForReverseLinesFromFile.pop());
  }
}
