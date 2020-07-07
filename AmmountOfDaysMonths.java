/*4. Print the number of days each month has. Use switch. */


import java.util.Scanner;

public class AmmountOfDaysMonths {

public static void main (String [] args) {


Scanner in = new Scanner(System.in);
System.out.println("Enter a Month to found how many days has : ");

String month = in.next();


switch (month){
case "January" : case "March" : case "May" : case "July" : case "August": case "October" : case "December" :
System.out.println(month + " has 31 days. ");
break;
case "April" : case "September" : case "June" : case "November" :
System.out.println(month + " has 30 days. ");
break;
case "February" :
System.out.println(" For what year are you interested to know? : ");
int year = in.nextInt(); 
if  ( ( (year%4 == 0 ) && (year%100!=0) )  || ( (year%4 == 0 ) && (year%100 ==0) && (year %400!=0) )  ) {
System.out.println(month + " has 29 days because " + year + " is a Leap Year.");
} else {
System.out.println(month + " has 28 days. ");
}
break;
default:
System.out.println("Wrong input.");
}


}
}