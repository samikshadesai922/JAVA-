import java.util.Scanner;
public class Main{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of day");
	int day = sc.nextInt();
	
	switch(day){
	case 1 -> System.out.println("It's Monday");
	case 2 -> System.out.println("It's Tuesday");
	case 3 -> System.out.println("It's Wednesday");
	case 4 -> System.out.println("It's Thursday");
	case 5 -> System.out.println("It's Friday");
	case 6 -> System.out.println("It's Saturday");
	case 7 -> System.out.println("It's Sunday");
	default -> System.out.println("ohh no!! Invalid day");
	}
    }
}