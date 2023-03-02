package com.knight.collection;

import java.util.ArrayList;


public class ArrayListExam {

  public static void main(String[] args) {

    ArrayList<Object> list = new ArrayList();

    list.add("문자열 입력");
    list.add("테스트");
    list.add(1);
    list.add(4);
    list.add(5);

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) instanceof Integer) {
        int number = (int) list.get(i);
        System.out.println("숫자부분 : " + number);
      } else {
        String str = (String) list.get(i);
        System.out.println("문자열부분 : " + str);
      }
    }


  }

}
