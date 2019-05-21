package edu.cnm.deepdive;


import java.util.Scanner;

public class GaussianSum {

  public static void main(String[] args) {
    int upperLimit;
    long sum;
    Scanner input = new Scanner(System.in);
    upperLimit = -1;
    while (upperLimit < 1 || upperLimit > 1000000) {
      System.out.println("Please enter a number that is between 1 and 1000000.");
      while (!input.hasNextInt()) {
        System.out.println ("That value is not a valid entry. Please enter a number between 1 and 100000.");
        input.next();
      }
      upperLimit = input.nextInt();
    }
    sum = (long) upperLimit * (upperLimit + 1) / 2;
    System.out.println("The gaussian sum of " + upperLimit + " is " + sum);
  }
}
