// Learning java zero to advanced
// shows bitwise Xor  of two numbers.
import java.util.Scanner;
public class program23{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to bitwize oparetor ");
    System.out.print("please enter your First number : ");
    int First = input.nextInt();
    System.out.print("please enter your second  number : ");
    int second = input.nextInt();
    
   int Xor  = First ^ second  ;
   System.out.println("your bitwise and result is : " + Xor);  
  }
}