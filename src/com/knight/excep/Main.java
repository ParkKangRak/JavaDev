package com.knight.excep;

class ArrayCalculation {

  int[] arr = {0, 1, 2, 3, 4};

  public int divide(int denominatorIndex, int numeratorIndex) {
    return arr[denominatorIndex] / arr[numeratorIndex];
  }
}

public class Main {

  public static void main(String[] args) {
    ArrayCalculation arrayCalculation = new ArrayCalculation();

    try {
      System.out.println("2 / 1 = " + arrayCalculation.divide(2, 1));
      System.out.println(
          "1 / 0 = " + arrayCalculation.divide(1, 0)); // java.lang.ArithmeticException: "/ by zero"
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌수 없습니다. 0을 제외한 값을 넣어주세요");
    }
    try {
      System.out.println("Try to divide using out of index element = "
          + arrayCalculation.divide(5, 0)); // java.lang.ArrayIndexOutOfBoundsException: 5
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열의 범위를 초과할수없습니다. "+(arrayCalculation.arr.length-1)+"이하로 넣어주세요");
    }
  }

}
