import java.util.Scanner;
class stack
{
	int x[]=new int[10];
	int top;
	stack()
	{
		top=-1;
	}
	void push
	{
		System.out.println("i am push method");
	}
	void pop
	{
		System.out.println("i am pop");
	}
	void traverse()
	{
		System.out.println("iu am traverse");
	}
	public static void main(String args[])
	{
		Scanner ob=new Scanner(Ststem.in);
		stack ob=new stack();
		int op;
		char ch='y';
		do
		{
			System.out.println("\n Menu\n_____\n1.Push\n2.pop\n3.Traverse");
			System.out.Println("Enter your Option");
			op=ob.nextInt();
			switch(op)
			{
				case 1:
					ob.push();
					break;
				case 2:
					ob.pop();
					break;
				case 3:
					ob.traverse();
					break;
				default:
					System.out.println("invalid entry!!!");
					break;
		}
		System.out.println("Do you want to con'!!![y/n]");
		ch=ob1.next().charAt(0);
	}while(ch=='y');
	System.out.println("Thank you and visit again");
	}
}
