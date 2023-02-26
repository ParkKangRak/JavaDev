package com.kngiht.bagic;

public class Main {

  public static void main(String[] args) {

    Animal[] ani = {new Dog("멍멍"), new Cat("냐옹")};

    ani[0].speak();
    ani[1].speak();

    Dog dog = (Dog) ani[0];
    dog.swim();

  }

}


class Animal {

  String name;

  public void speak() {
    System.out.println(name + "crying");
  }

}

class Dog extends Animal {

  public Dog(String name) {
    this.name = name;
  }

  public void swim() {
    System.out.println("강아지수영쌉가능");
  }
}

class Cat extends Animal {

  public Cat(String name) {
    super.name = name;
  }
}