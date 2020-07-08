/*7. Program should ask your weight and planet. Compute your weight on the planet based on the table below:
#    Planet    Relative gravity
1    Venus        0.78
2    Mars        0.39
3    Jupiter    2.65
4    Saturn    1.17
5    Uranus    1.05
6    Neptune    1.23
So, for example, if your weight is 80 kg on earth, then you would weigh just over 31 kg on Mars, 
since Mars' gravity is 0.39 times earth's gravity. (80 * 0.39 is 31.20). */





import java.util.Scanner;

public class WeightPlanets {

public static void main (String [] args) {

Scanner in = new Scanner(System.in);

float gravityVenus =0.78f ;
float gravityMars = 0.39f;
float gravityJupiter = 2.65f;
float gravitySaturn = 1.17f;
float gravityUranus = 1.05f;
float gravityNeptune = 1.23f;

System.out.println("Enter your weight in kilos : ");
float kg = in.nextFloat();


System.out.println("Enter the planet you want to convert your weight to : ");
String planet = in.next();



switch (planet) {
case "Venus" : case "VENUS" : case "venus" :
System.out.println("Your weight on " + planet + " is: " + (kg* gravityVenus) + " kg.");
break;
case "Mars" : case "MARS" : case "mars" :
System.out.println("Your weight on " + planet + " is: " + (kg* gravityMars) + " kg.");
break;
case "Jupiter" : case "JUPITER" : case "jupiter" :
System.out.println("Your weight on " + planet + " is: " + (kg* gravityJupiter)+ " kg." );
break;
case "Saturn" : case "SATURN" : case "saturn" :
System.out.println("Your weight on " + planet + " is: " + (kg* gravitySaturn) + " kg.");
break;
case "Uranus" : case "URANUS" : case "uranus" :
System.out.println("Your weight on " + planet + " is: " + (kg* gravityUranus)+ " kg." );
break;
case "Neptune" : case "NEPTUNE" : case "neptune" :
System.out.println("Your weight on " + planet + " is: " + (kg* gravityNeptune) + " kg.");
break;
default:
System.out.println("Wrong input.");

}



}
}

