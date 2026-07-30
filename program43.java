//Learning java zero to advanced
//check if the given array is sorted.

import java.util.Scanner;

public class program43{
  public static void main(String args []){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to array Shorting Check Post ");

    System.out.print("Please Enter Your Number of Eliment : ");
    int size = input.nextInt();

    int[] num = new int[size];
    int i = 0;
    while(i < size){
      System.out.print("please enter your "+(i+1)+" eliment : ");
      num[i]=input.nextInt();
      i++;
    }
    boolean isIncres = isIncreasing(num);
    boolean isDecres = isDecreasing(num);
    if(isIncres || isDecres){
      System.out.println("Your Array is Shorted ");
    }else{
      System.out.println("Your Array is not Shorted");
    }
  }

  public static boolean  isIncreasing(int num[]) {
    int i = 1;
    while(i < num.length){
      if(num[i] < num[i-1] ){
        return false;
      }
      i++;
    }
      return true;
  }

  public static boolean  isDecreasing(int num[]) {
     int i = 1;
    while(i < num.length){
      if(num[i] > num[i-1] ){
        return false;
      }
      i++;
    }
      return true;
  }
}