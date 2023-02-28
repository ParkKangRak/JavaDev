package com.knight.excep;

class ArrayCalculation {

  int[] arr = { 0, 1, 2, 3, 4 };

  public int divide(int denominatorIndex, int numeratorIndex) {
    return arr[denominatorIndex] / arr[numeratorIndex];
  }
}

public class Main {
  public static void main(String[] args) {
    ArrayCalculation arrayCalculation = new ArrayCalculation();

    System.out.println("2 / 1 = " + arrayCalculation.divide(2, 1));
    System.out.println("1 / 0 = " + arrayCalculation.divide(1, 0)); // java.lang.ArithmeticException: "/ by zero"
    System.out.println("Try to divide using out of index element = "
        + arrayCalculation.divide(5, 0)); // java.lang.ArrayIndexOutOfBoundsException: 5
  }

}
