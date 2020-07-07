/*1. What class in school are you going according to age; 5-12 elementary, 13-15 middle school, 16-18 high school. */

import java.util.Scanner;

public class ClassAccordingToAge{

public static void main (String [] args) {

Scanner in = new Scanner(System.in);

System.out.println("Enter your age: ");
byte age = in.nextByte();

switch (age) {
 case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12:
 System.out.println("You are going to Elementary School.");
 break;
 case 13: case 14: case 15:
 System.out.println("You are going to Middle School.");
 break;
 case 16: case 17: case 18:
 System.out.println("You are going to High School.");
 break;
 default:
 System.out.println("You are not going to School.");
}



}
}
