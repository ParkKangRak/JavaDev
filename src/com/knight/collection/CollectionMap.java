package com.knight.collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {

  public static void main(String[] args) {

    Map<Integer, String> map = new HashMap<>();
    map.put(1, "왜 int 가 아니라 보통 integer로 쓰는걸까 chat gpt 한테 물어봐야지");
    map.put(2, "자료구조, 컬렉션 프레임워크 배우는중인데 생각보다 재밌기도 하고 할만하기도 함.");
    map.put(3, "Knight");
    map.put(4, "오늘배운 것들의 특징을 보면 대체적으로 비슷해");
    map.put(5, "어레이리스트, 링크리스트, 백터, 배열 등이 있지만 대부분 어레이리스트를 사용, 백터는 쓰레드, 링크리스트는 삭제가 자주 있을떄 사용");
    map.put(6, "리스트는 내가 순서대로 짠거에 대해 나열함, 중복도 허용함, ");
    map.put(7, "셋같은경우 중복허용안하고, 내가 나열한것과 무관하게 순차적으로 배열함");
    map.put(8, "맵같은 경우 키 밸류로 이뤄짐 키같은 경우 중복없고 밸류는 중복을 허용해, 밸류 값이 동일한게 여러개가 있을수도 있으니 당연한것");
    map.put(9, "또한 맵같은경우 어떤값을 넣을건지 설정해야된다, 숫자, 문자열, 문자열, 숫자, 숫자,숫자, 문자열,문자열");
    map.put(10, "동국대학교 컴퓨터공학과");
    System.out.println(map.get(10) + " " + map.get(3));


  }

}
