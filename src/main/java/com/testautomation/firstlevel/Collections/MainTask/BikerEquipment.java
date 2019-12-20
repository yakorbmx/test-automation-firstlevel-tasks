package com.testautomation.firstlevel.Collections.MainTask;

public class BikerEquipment {
  private String name;
  private double weight;
  private double price;

  public double getWeight() {
    return weight;
  }

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public BikerEquipment(double weight, double price, String name) {
    this.weight = weight;
    this.price = price;
    this.name = name;
  }

  @Override
  public String toString() {
    return "BikerEquipment{"
        + "name='"
        + name
        + '\''
        + ", weight="
        + weight
        + ", price="
        + price
        + '}';
  }
}
