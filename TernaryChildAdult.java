/*9. Use ternary to return a message child or adult. Older than 18 is adult.*/


import java.util.Scanner;

public class TernaryChildAdult {

public static void main (String [] args) {


Scanner in = new Scanner(System.in);

System.out.println("Please enter your age : ");

byte age = in.nextByte();

if (age>0) {
String checkAge = (age >= 18) ? "You are an adult." : "You are a child."; 
        System.out.println(checkAge);

} else {System.out.println("It is not possible.");
}


}
}