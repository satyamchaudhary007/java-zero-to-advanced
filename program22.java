// Learning java zero to advanced
// shows bitwise or of two numbers.
import java.util.Scanner;
public class program22{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to bitwize oparetor ");
    System.out.print("please enter your First number : ");
    int First = input.nextInt();
    System.out.print("please enter your second  number : ");
    int second = input.nextInt();
    
   int or  = First | second  ;
   System.out.println("your bitwise and result is : " + or );  
  }
}