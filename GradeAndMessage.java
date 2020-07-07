/* 5. Get message ("Perfect, Good, Pass, Fail") based on grade (A, B, C-D, the rest). */


import java.util.Scanner;

public class GradeAndMessage {

public static void main (String [] args) {

Scanner in = new Scanner(System.in);
System.out.println("Enter your grade to check if you passed : ");
char grade = in.next().charAt(0);

switch (grade) {
case 'A' : case 'a' :
System.out.println("Perfect.");
break;
case 'B' : case 'b' :
System.out.println("Good.");
break;
case 'C' : case 'D' : case 'c' : case 'd' :
System.out.println("Pass.");
break;
case 'F' : case 'f' :
System.out.println("Fail.");
break;
default:
System.out.println("Wrong input.");


}

}
}