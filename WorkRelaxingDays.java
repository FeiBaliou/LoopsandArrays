/*2. What to do every day (switch). Monday-Friday: go to work. Sat-Sun: relaxing. */

import java.util.Scanner;

public class WorkRelaxingDays {

public static void main (String [] args) {

Scanner in = new Scanner(System.in);

System.out.println("Enter a day : " );

String day = in.next();

switch (day){
 case "Monday" : case "monday" : case "MONDAY" :
 case "Tuesday" : case "tuesday" : case "TUESDAY" :
 case "Wednesday" : case "wednesday" : case "WEDNESDAY" :             
 case "Thursday" :  case "thursday" : case "THURSDAY" :  
 case "Friday" :  case "friday" : case "FRIDAY" :  
 System.out.println("Go to work!");
 break;
 case "Saturday": case "saturday" : case "SATURDAY" :  
 case "Sunday" : case "sunday" : case "SUNDAY" :  
 System.out.println("It's weekend.Just relax!");
 break;
 default:
 System.out.println("Wrong input");
        }


}
}