package lecture1.solutions;

import java.util.Scanner;

public class BreakingDistance{
   public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	int speed= s.nextInt();
	double reaction= (3*(speed/10.0));
	double breakVal= ((speed/10.0) * (speed/10.0));
	double breakDistance = reaction + breakVal;
	System.out.println("The breaking distance ist: "+ breakDistance);
   }
}
