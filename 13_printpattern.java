import java.util.Scanner;
class printpattern
{
	public static void main(String args[])
	{
		char x='A',y='B';
		for(int i=65;i<=69;i++)
		{
			for(int j=65;j<=i;j++)//inner loop to generate no of cols in matrix
			{
				System.out.print((char)i);
			}//end of inner loop
		System.out.println();//this println helps to break a line after each inner loop
		}//end of outer loop
	}
}

		