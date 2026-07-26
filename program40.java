//Learning java zero to advanced
//find the sum and average of all elements in an array.
public class program40{
  public static void main(String[] args) {

      System.out.println("Welcome to array sum and average");
      /*import java.util.Scanner;

      there are arrayutility method.
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
}*/
      int[] numarry = arrayutility.inputarray();
      long sum = sumarray(numarry);
      double avg = average(numarry);
      System.out.println("Sum of the number is : "+ sum);
      System.out.println("Average of the Number is : "+avg);
  }
  public static long  sumarray(int[] numarry) {
    int sum = 0;
    int i = 0;
    while(i < numarry.length){
      sum = sum + numarry[i];
      i++;
    }
      return sum;
  }


  public static double  average(int[] numarry) {
    double sum = sumarray(numarry);
    return (sum/numarry.length);
  }
}