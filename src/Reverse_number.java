import java.util.Scanner;
public class Reverse_number 
{
	 private static Scanner scanner;

	public static void main(String args[])
	   {
	      int num=0;
	      int reversenum =0;
	      System.out.println("Input your number and press enter: ");
	      scanner = new Scanner(System.in);
	      //Captured input would be stored in number num
	      num = scanner.nextInt();
	      //While Loop: Logic to find out the reverse number
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of input number is: "+reversenum);
	   }


}
