// Learning java zero to advanced
// grade finder calculator !! 

import java.util.Scanner;

public class program19{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to Grading System  !! ");

      System.out.print("Please enter your marks  : ");
      int marks = input.nextInt();
      if(marks >=90 && marks <=100){
        System.out.println("congratulation you got A Grade ");
      }else if (marks >= 75 && marks <=89 ){
        System.out.println("very Good! you got B Grade  ");
      }else if (marks >= 60 && marks <=74){
        System.out.println(" Good! you got C Grade  ");
      }else if (marks >= 30 && marks <=59){
        System.out.println("you got D Grade work harder ");
      }else if (marks <= 29 && marks >=0){
        System.out.println("you got F Grade Better luck next time.");
      }else{
        System.out.println("please enter valid marks !! ");
      }
}
}