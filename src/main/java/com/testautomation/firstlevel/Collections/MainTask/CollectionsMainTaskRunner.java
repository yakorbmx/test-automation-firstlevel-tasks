package com.testautomation.firstlevel.Collections.MainTask;

import java.util.*;

public class CollectionsMainTaskRunner {
  public static void main(String[] args) {
    List<BikerEquipment> equipment = new ArrayList<>();
    Helmet helmet = new Helmet(1.59, 485.99);
    Jacket jacket = new Jacket(0.5, 219.0);
    Pants pants = new Pants(0.7, 249.99);
    Boots boots = new Boots(1.2, 269.95);
    Gloves gloves = new Gloves(0.2, 49.97);
    equipment.add(helmet);
    equipment.add(jacket);
    equipment.add(pants);
    equipment.add(boots);
    equipment.add(gloves);
    sortEquipmentByWeight(equipment);
    calculateTotalPriceOfEquipment(equipment);
    findEquipmentPriceInCurrentRange(equipment);
  }

  public static void sortEquipmentByWeight(List<BikerEquipment> equipment) {
    System.out.println("List of equipment sorted by weight (from low to high): ");
    equipment.sort(Comparator.comparing(BikerEquipment::getWeight));
    System.out.println(equipment.toString());
  }

  public static void calculateTotalPriceOfEquipment(List<BikerEquipment> equipment) {
    int totalPrice = 0;
    for (BikerEquipment bikerEquipment : equipment) {
      totalPrice += bikerEquipment.getPrice();
    }
    System.out.println("Total price of equipment = " + totalPrice);
  }

  public static void findEquipmentPriceInCurrentRange(List<BikerEquipment> equipment) {
    double minimalPrice;
    double maximalPrice;
    System.out.println("Enter range of equipment price (Use '.' character to divide the number):");
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Enter minimal price: ");
    minimalPrice = scanner.nextDouble();
    System.out.println("Enter maximal price: ");
    maximalPrice = scanner.nextDouble();
    System.out.println("Equipment in range from " + minimalPrice + " to " + maximalPrice + "$: ");
    for (BikerEquipment bikerEquipment : equipment) {
      if (bikerEquipment.getPrice() > minimalPrice && bikerEquipment.getPrice() < maximalPrice) {
        System.out.println(bikerEquipment);
      }
    }
  }
}
