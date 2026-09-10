//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Alexa Cacchiola
 */

public class Main {
  public static void main(String[] args) {

    Lab1 lab = new Lab1();

    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

    System.out.println("Array in order:");

    int i = 0;

    while (i < nums.length) {
      System.out.print(nums[i] + " ");
      i++;
    }

    System.out.println();

    System.out.println("Array in reverse:");

    for (i = nums.length - 1; i >= 0; i--) {
      System.out.print(nums[i] + " ");
    }

    System.out.println();

    System.out.println("First value: " + nums[0]);
    System.out.println("Last value: " + nums[nums.length - 1]);

    System.out.println("Max of 5 and 9: " + lab.max(5, 9));
    System.out.println("Min of 5 and 9: " + lab.min(5, 9));
    System.out.println("Sum: " + lab.sum(nums));
    System.out.println("Average: " + lab.average(nums));
    System.out.println("Maximum: " + lab.max(nums));
    System.out.println("Minimum: " + lab.min(nums));

    System.out.println("Increment: " + lab.increment(1));
  }
}

class Lab1 {

  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  public int sum(int[] nums) {
    int total = 0;

    for (int num : nums) {
      total += num;
    }

    return total;
  }

  public double average(int[] nums) {
    int total = 0;

    for (int num : nums) {
      total += num;
    }

    return (double) total / nums.length;
  }

  public int max(int[] nums) {
    int maximum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > maximum) {
        maximum = nums[i];
      }
    }

    return maximum;
  }

  public int min(int[] nums) {
    int minimum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < minimum) {
        minimum = nums[i];
      }
    }

    return minimum;
  }
}