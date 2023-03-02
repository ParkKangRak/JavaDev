package com.knight.peoplegame;

public class GrandParent extends People {

  public GrandParent(String name, int age) {
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
}
