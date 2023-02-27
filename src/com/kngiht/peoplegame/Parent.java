package com.kngiht.peoplegame;

public class Parent extends People {

  public Parent(String name, int age) {
    super(name, age);
  }


  @Override
  public void location() {
    getX();
    getY();
  }

  @Override
  public void walk(int x, int y) {

  }


  public void run() {

  }

}
