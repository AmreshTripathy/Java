import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
		int num,t,sum=0,r;
		//num to store input value
		//t to store the copy of original
		//sum and r is to store the rem and div values
		Scanner ob=new Scanner(System.in);
		System.out.println("enter a num");
		num=ob.nextInt();
		t=num;
		while(num>0) //153>o t
		{
			r=num%10;//153%10 3
			sum=sum*10+r;//0=0*10+3
			num=num/10;//153/10=15 1 0
		}
		if(t==sum)
			System.out.println("num is pelindramic:"+t);
		else
			System.out.println("num is not pelindromic"+t);
	}//end of main
}//end of class