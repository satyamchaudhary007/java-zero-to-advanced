// Utility method to take array input from the user.
//Reusable across different programs to avoid writing the input logic repeatedly.
import java.util.Scanner;
public class arrayutility{
  public static int[]  inputarray() {
    Scanner input = new Scanner(System.in);
      System.out.print("Please Enter the Number of eliment : ");
      int size = input.nextInt();

      int[] nums = new int[size];
      int i = 0;
      while(i < size){
        System.out.print("Please enter eliment no "+(i+1)+": ");
        nums[i] = input.nextInt();
        i++;
      }
      return nums;
  }

}