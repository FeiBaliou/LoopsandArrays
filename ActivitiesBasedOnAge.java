/* 6. Based on age what can you do?
lt 16   >>You cannot drive
16-17 >>You can drive but not vote
18-21 >>You can vote but not drink
gt 22  >>You can do anything */


import java.util.Scanner;

public class ActivitiesBasedOnAge {

public static void main(String [] args ) {

Scanner in = new Scanner(System.in);

System.out.println("Enter your age: " );
byte age = in.nextByte();
returnActivities (age);

}

public static void returnActivities(Byte age){

if (age<16) {
System.out.println("You cannot drive.");
}
 if ((age==16) || (age ==17) ) {
System.out.println("You can drive but not vote.");
}
if ( (age>=18) && (age<=21) ) {
System.out.println("You can vote but not drink.");
}
if ( age>21) {
System.out.println("You can do anything.");

}

}

}
