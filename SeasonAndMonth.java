/* 3. What season is according to month. Enter month from terminal. */


public class SeasonAndMonth {

public static void main (String [] args) {

String month = args[0];

switch (month) {

case "June": case "July": case "August" :
System.out.println("It's Summer!");
break;
case "September": case "October" : case "November" :
System.out.println("It's Autumn.");
break;
case "December": case "January" : case "February" :
System.out.println("It's Winter.");
break;
default:
System.out.println("Wrong input.");
 }



}
}