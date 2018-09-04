
import java.util.Scanner;

public class Even_Odd
{
	//2nd comment from github
	//new comment for test
// Test comment
	private static Scanner scanner;

	public static void main(String[] args)
	 {
	    int num;
	    System.out.println("Enter an Integer number:");

	    scanner = new Scanner(System.in);
	    num = scanner.nextInt();

	    /* If number is divisible by 2 then it's an even number
	     * else odd number*/
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	  }

}
