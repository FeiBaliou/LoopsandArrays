/*2. Create a program that stores 5 integers in an array. Print the sum of these numbers. Print the smallest number, 
print the largest number, print the average value of all the numbers. 
Print the array from the beginning to the end and from the end to the beginning. */

import java.util.Scanner;

public class IntegerInAnArray {

public static void main (String [] args ) {

Scanner in = new Scanner(System.in);

float numbers [] = new float[5];

System.out.println("Enter 5 numbers : ");

for(int i = 0; i < 5; i++)
        {
            numbers[i] = in.nextInt();
        }


float sum = numbers[0];
for(int i=1; i<numbers.length;i++){ 
    sum+= numbers[i] ;
}
        System.out.println("The sum of numbers is: " + sum);




float max = numbers[0];
for(int i=1; i<numbers.length;i++){ 
    if(numbers[i] > max){ 
    max = numbers[i];
} 
}
System.out.println("The largest number is : "+max + ".");

float min = numbers[0];
for(int i=1; i<numbers.length;i++){ 
    if(numbers[i] < min){ 
    min = numbers[i];
} 
}
System.out.println("The smallest number is : "+min + ".");


//int avg = numbers[0];
//for (int i=1; i<numbers.length; i++){
//sum += (numbers[i]);
//    }
      float avg = sum / numbers.length;
      System.out.println("Average: " + avg);


System.out.print("The Array has the following numbers: ");
for (float number:numbers)
{
 System.out.print((int)number + " ");
}


System.out.println("");

System.out.print("Array in reverse: ");
for(int i=numbers.length -1; i>=0; i--)
{ 
System.out.print((int)numbers[i] + " ");
}

}
}