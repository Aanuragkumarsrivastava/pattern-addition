import java.util.Scanner;

public class Main 
{
  
	public static void main(String[] args) 
	{
  
		Scanner input=new Scanner(System.in);
  
		System.out.println("enter the number");
  
		int a = input.nextInt(); // taking the integer a from the user
  
		int b = 10*a+a; // getting "nn" number
  
		int c = (100*a)+b; // getting "nnn" number
  
		int d = a+b+c; //adding above 3 numbers in the form n+nn+nnn
  
		System.out.println("sum of\n"+a+"\n"+b+"\n"+c+"\nis as follows\n"+d); // displaying the result of addition

	}

}
