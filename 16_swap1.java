import java.util.Scanner;
class swap1
{
	void swap(int x,int y)//function defination,formal par
	{
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);
	}
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int x1,x2;
		x1=ob.nextInt();
		x2=ob.nextInt();
		System.out.println("before swap"+x1+" "+x2);
		//swap(x1,x2)
		swap1 ob1=new swap1();//java calls donothing
		ob1.swap(x1,x2);//calling method using object
		System.out.println("after swapping"+x1+" "+x2);
	}
}
