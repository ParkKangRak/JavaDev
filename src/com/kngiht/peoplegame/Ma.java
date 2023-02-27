package com.kngiht.peoplegame;

import java.util.Scanner;

public class Ma {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    GrandParent gParent = new GrandParent("할아버지", 75);
    Parent parent = new Parent("아버지", 55);
    Son son = new Son("자식", 33);

    while (true) {
      System.out.println("1. 이름,나이,속도,현재위치 확인");
      System.out.println("2. 걷기");
      System.out.println("3. 뛰기");
      System.out.println("4. 수영하기");

      int number = scan.nextInt();
      if (number == 1) {
        son.location();


      } else if (number == 2) {
        son.walk(1, 1);
      } else if (number == 3) {
        son.run(2, 2);
      } else if (number == 4) {
        son.swim(3, -1);
      }


    }


  }

}
