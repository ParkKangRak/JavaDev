package com.kngiht.peoplegame;

public class GrandParent extends People {

  public GrandParent(String name, int age) {
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
}
