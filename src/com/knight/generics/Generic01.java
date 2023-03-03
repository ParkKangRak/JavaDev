package com.knight.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generic01 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    while (true) {
      List list = new ArrayList<>();
//      제네릭스를 설정하지 않는경우 캐스팅 에러가 발생한다. (런타임에러, 심각)
      Object obj = scan.next();
      list.add(obj);
      Integer number = (Integer) list.get(0);
      System.out.println(list);


    }


  }

}
