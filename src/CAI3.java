import java.util.Scanner;
import java.util.Random;

public class CAI3 {
public static void main(String[] args) {
QandA();

}
public static void QandA() {
Random rand = new Random();
Scanner sc =new Scanner(System.in);
int i=1, c=0 , r=0;

while(i<=10) {
int num1 = rand.nextInt(10);
int num2 = rand.nextInt(10);
int ans1 = askQuestion(num1,num2);
int ans2 = readResponse();
if(ans1 == ans2) {
displayCorrectResponse();
c++;
break;
}
else {
displayIncorrectResponse();
r++;
}
i++;
}
displayCompletionMessage(c);
System.out.println("Do you want to solve another new problem(Y/N)?");
char ch = sc.next().charAt(1);
if(ch== 'Y' || ch=='y') {
QandA();
}
else{
System.exit(0);
}
}
public static int readResponse() {
      Scanner choice = new Scanner(System.in);
      int val = choice.nextInt();
      return val;
  }
  
public static int askQuestion(int num1, int num2) {
System.out.println("How much is "+num1+" times "+num2 +":");
return num1*num2;
}
public static boolean IsAnswerCorrect(int ans1,int ans2) {
if(ans1 == ans2) {
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
}
  }

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
  }
  public static void displayCompletionMessage(int c)
  {
      float p=(float)c/10*100;   //calculation of score percentage
      System.out.println("Your Score is"+p+"%");
      if(p>=75)
          System.out.println("Congratulations, you are ready to go to the next level!");
      else
          System.out.println("Please ask your teacher for extra help.");
 }
}