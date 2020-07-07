/*3. From 1 to 30 print numbers divisible by 4 and 5. How many are they? How many are not? */

public class NumbersDivisibleby4And5 {

public static void main (String [] args){

int x = 0;

for(x = 1; x<31; x++) { 
  if( (x%4 == 0) && (x%5 ==0) ){
  System.out.print("Numbers from 1 to 30 which are divisible by 4 and 5 : " + x + " .");
}
}


}
}