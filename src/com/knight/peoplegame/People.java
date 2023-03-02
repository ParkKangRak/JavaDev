package com.knight.peoplegame;

public abstract class People {

  private String name;
  private int age, x, y;


  public People(String name, int age) {
    this(name, age, 0, 0);
  }


  public People(String name, int age, int x, int y) {
    this.name = name;
    this.age = age;
    this.x = x;
    this.y = y;
  }

  public abstract void location();

  public abstract void walk(int x, int y);


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getX() {

    return x;
  }

  public void setX(int x) {
    this.x += x;
  }

  public int getY() {

    return y;
  }

  public void setY(int y) {
    this.y += y;
  }
}
