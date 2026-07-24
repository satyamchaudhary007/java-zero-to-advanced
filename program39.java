//Learning java zero to advanced
//pettern print using loop  !

import java.util.Scanner;
public class program39{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to pettern printing  ");
      System.out.print("Please Enter the Number of rows : ");
      int num = input.nextInt();
      PrintRightHalfPyramid(num);
      PrintReverceHalfPyramid(num);
      PrintLeftHalfPyramid(num);
  }

  public static void PrintReverceHalfPyramid(int Maxrows) {
    System.out.println("\n Here is Reverce Right Half Pyramid");
      int rows = Maxrows;
      while(rows > 0){
        int i =0;
        while(i < rows ){
          System.out.print("* ");
          i++;
        }
        System.out.println();
        rows--;
      }
  }
public static void PrintLeftHalfPyramid(int Maxrows) {
    System.out.println("\nHere is Left Half Pyramid");
    int rows = Maxrows;
    while (rows > 0) {
        // Print Spaces
        int j = 0;
        while (j < rows - 1) {
            System.out.print("  ");
            j++;
        }
        // Print Stars
        int i = 0;
        while (i <= (Maxrows - rows)) {
            System.out.print("* ");
            i++;
        }

        System.out.println();
        rows--;
    }
}


  public static void PrintRightHalfPyramid(int Maxrows){
    System.out.println("\n Here is Right Half Pyramid");
      int rows = 0;
      while(rows < Maxrows ){
        System.out.print("*");
        int i =0;
        while(i < rows){
          System.out.print(" *");
          i++;
        }
        System.out.println();
        rows++;
      }
  }
  }
