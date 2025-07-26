import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your marks");
	int marks = sc.nextInt()	;

	if (marks >= 90)
	{
	  System.out.println("Your grade is A");
	}
 
	else if(marks >= 75)
	{
	  System.out.println("Your grade is B");
	}

	else if(marks >= 60)
	{
	  System.out.println("Your grade is C");
	}
	
	else if(marks >= 40)
	{
	  System.out.println("Your grade is D");
	}

	else
	{
	  System.out.println("Fail");
	}
}
}