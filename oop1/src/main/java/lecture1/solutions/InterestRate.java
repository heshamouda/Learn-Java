package lecture1.solutions;

public class InterestRate {
	public static void main(String[] args){
		double amount= 2000;
		double interestValue= 0.02;
		double interest=0;
		int year=1;
		interest= amount * interestValue;
		amount= amount+interest;
		System.out.println("In Year "+year+". There is "+interest+" interest. Account balance: " +amount+" Fr.");
		year++;
		interest= amount * interestValue;
		amount= amount+interest;
		System.out.println("In Year "+year+". There is "+interest+" interest. Account balance " +amount+" Fr.");
		year++;
		interest= amount * interestValue;
		amount= amount+interest;
		System.out.println("In Year "+year+". There is "+interest+" interest. Account balance " +amount+" Fr.");
		year++;
		interest= amount * interestValue;
		amount= amount+interest;
		System.out.println("In Year "+year+". There is "+interest+" interest. Account balance " +amount+" Fr.");
		year++;
		interest= amount * interestValue;
		amount= amount+interest;
		System.out.println("Im Jahr "+year+". Jahr gibt es "+interest+" Zins. Kontostand: " +amount+" Fr.");
		year++;
	}
}
