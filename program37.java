//Learning java zero to advanced
//Armstrong number checker !

import java.util.Scanner;
public class program37{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Armstrong Number ");

      System.out.print("Please Enter Your Number : ");
      int num = input.nextInt();
      boolean isArmstrong = isArmstrong(num);
      
      if(isArmstrong){     
         System.out.println("Your Number is Armstrong ");
      }else{
        System.out.println("Your Number is not Armstrong ");
      }
  }
   public static boolean  isArmstrong(int num) {
    int noOfdigit = noOfdigit(num);
    int numcopy = num;
    int finalNumber = 0;
    while(num > 0){
      int Lastdigit = num % 10;
      num /=10;
      finalNumber += power(Lastdigit,noOfdigit);
    }
  return finalNumber == numcopy;    
  }
  public static int power(int num1 , int num2) {
      int result = num1;
      int i = 1;
      while(i < num2){ 
        result *= num1;
        i++;
      }
      return result;
  }
  public static int noOfdigit(int num ) {
      int digit =0;
      while(num > 0){
        digit++;
        num /=10;
      }
      return digit;
  }
}