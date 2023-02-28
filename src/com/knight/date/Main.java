package com.knight.date;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

public class Main {

  public static void main(String[] args) {

    LocalDateTime dateTime = LocalDateTime.now();

    System.out.println("현재시간 : " + dateTime);
  }

}
