/* 1. Create a program that stores the names of your 4 best friends in an array. Then print these names from the array. */

import java.util.Scanner;

public class StoreNamesInArray {

public static void main (String [] args) {


Scanner in = new Scanner(System.in);


String  names [] = new String[4];

System.out.println("Enter the names of your 4 best friends : ");

for(int i = 0; i < 4; i++)
        {
            names[i] = in.next();
        }

 System.out.print("The names of your best friends are : ");
  for (int g = 0; g < names.length; g++) {
      System.out.print(names[g] + " ");
  }



}
}