package com.kngiht.peoplegame;

public class Son extends People {

  public Son(String name, int age) {
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

  public void swim(int x, int y) {
    setX(x);
    setY(y);
  }


  public void gun() {
    System.out.println("모든사람을 공격하여 원점으로 보낸다.");
  }
}
