import java.util.Scanner;
class circle
{
	int area;
	void Circle()
	{
		Scanner ob=new Scanner(System.in);
		int r;
		System.out.println("Enter radius");
		r=ob.nextInt();
		double res;
		res=3.142*r*r;
		System.out.println("Area of circle is"+res);
	}
	public static void main(String args[])
	{
		Circle c=new Circle();
	}
}