package programs;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) 
	{
		System.out.print("Enter the Number :");
		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();
		int length=String.valueOf(number).length();
			if(length == 1 || isArmstrong(number,length))
			{
				System.out.println(number+" is a amstrong");
			}
			else
			{
				System.out.println(number+" is not a amstrong");
			}
		scanner.close();
		
	}
	public static boolean isArmstrong(int number,int length) 
	{
		int sum=0;
		int originalNum=number;
		while(number > 0)
		{
			int rem=number%10;
			sum+=(int)Math.pow(rem, length);
			number/=10;
		}
		return originalNum == sum;
	}

}
