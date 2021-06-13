import java.util.Scanner;
class swap
{
	public static void main(String args[])
	{
		int m1,m2;
		Scanner ob=new Scanner(System.in);//abstrct not 1 arg
		m1=ob.nextInt();
		m2=ob.nextInt();
		System.out.println("before swapping");
		System.out.println(m1+" "+m2);
		m1=m1+m2;
		m2=m1-m2;
		m1=m1-m2;
		System.out.println("after swapping");
		System.out.println(m1+" "+m2);
	}
}
