package programs;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) 
	{
		System.out.print("Enter the Number :");
		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();
		int length=length(number);
		if(length == 1)
		{
			System.out.println(number+" is a amstrong");
		}
		else
		{
			if(isAmstrong(number,length) == number)
			{
				System.out.println(number+" is a amstrong");
			}
			else
			{
				System.out.println(number+" is not a amstrong");
			}
		}
		scanner.close();
		
	}
	public static int isAmstrong(int number, int length) 
	{
		int sum=0;
		while(number > 0)
		{
			int rem=number%10;
			sum+=power(rem,length);
			number/=10;
		}
		return sum;
	}
	
	

	private static int power(int rem, int length) 
	{
		int power=1;
		for (int i=0;i<length;i++)
		{
			power*=rem;
		}
		return power;
	}
	public static int length(int number) 
	{
		int length=0;
		while(number > 0)
		{
			length++;
			number/=10;
		}
		return length;
	}

}
