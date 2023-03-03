package com.knight.generics;

import java.util.ArrayList;
import java.util.List;

public class Generic01 {

  public static void main(String[] args) {

    List<Object> list01 = new ArrayList<>();

    list01.add(1);
    list01.add("2");
    System.out.println(list01);
    System.out.println("문자열을 숫자로 변경할경우 형변환필요, 기본형타입은 사용이 불가, 참조형타입인 Integer 사용");
    System.out.println("여기서 Object를 Integer로 바꾸는경우 런타임에러발생, 제네릭스를 통해 컴파일부터 차단 or 아래처럼 형변환 가능");
    Integer number = Integer.parseInt((String) list01.get(1));
    System.out.println(number);


  }

}
