import java.util.*;
public class CAI5 {

	public static void main(String[] args) {
	       quiz();
	   }

	   public static void quiz() {
	       Random rand = new Random();

	       int num1 = rand.nextInt(10);
	       int num2 = rand.nextInt(10);

	       while (true) {
	           int val1 = askQuestion(num1, num2);
	           int val2 = readResponse();
	           if (val1 == val2) {
	               displayCorrectResponse();
	               break;
	           }
	           displayIncorrectResponse();
	       }

	   }

	   public static int readResponse() {
	       Scanner scn = new Scanner(System.in);
	       int val = scn.nextInt();
	       return val;
	   }

	   public static int askQuestion(int num1, int num2) {

	       System.out.println("How much is " + num1 + " times " + num2);
	       return num1 * num2;
	   }

	   public static boolean isAnswerCorrect(int val1, int val2) {

	       if (val1 == val2) {
	           return true;
	       }
	       return false;
	   }

	   public static void displayCorrectResponse() {
		   Random rand = new Random();
		   int ForRep = rand.nextInt(4)+1;
		   switch (ForRep) {
		   case 1:
		   System.out.println("Very Good!");
		   break;
		   case 2:
		   System.out.println("Excelent!");
		   break;
		   case 3:
		   System.out.println("Nice Work!");
		   break;
		   case 4:
		   System.out.println("Keep Up The Good Work");
		   break;
		   }}

		   public static void displayIncorrectResponse() {
			   Random rand = new Random();
			   int ForRep = rand.nextInt(4)+1;
			   switch (ForRep) {
			   case 1:
			   System.out.println("No. Please try again.");
			   break;
			   case 2:
			   System.out.println("Wrong.Try Once More.");
			   break;
			   case 3:
			   System.out.println("Don't Give Up!");
			   break;
			   case 4:
			   System.out.println("No Keep Trying.");
			   break;
			   }

	}}

