//Learning java zero to advanced
//find number of occurrences of an element in an array.

import java.util.Scanner;

public class program41
{
public static void main(String args []){
Scanner input = new Scanner(System.in);
System.out.println("Welcome to array Occurrences\n");
 int[] numArray = arrayutility.inputarray();
 System.out.print("Now Enter the Number you want to find : ");
 int num = input.nextInt();
 int occurrences = noOfoccurrences(numArray, num);
 System.out.println("your eliment was founded "+ occurrences +"times in the array ");
   }

   public static int noOfoccurrences(int[] numarr , int num) {
    int occ = 0;
    int i = 0;
    while(i < numarr.length){
      if(numarr[i] == num){
        occ++;
      }
      i++;
    }
       return occ;
   }
}