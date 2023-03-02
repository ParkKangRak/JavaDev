package com.knight.peoplegame;

public class Parent extends People {

  public Parent(String name, int age) {
    super(name, age);
  }


  @Override
  public void location() {
    System.out.println(getName() + "," + getAge() + "(" + getX() + "," + getY() + ")");


  }

  @Override
  public void walk(int x, int y) {
    setX(x);
    setY(y);

  }


  public void run(int x, int y) {
    setX(x);
    setY(y);
  }

}
