class exe
{
	static int x;
	public void Read()
	{
		x=x+1;
		System.out.println("object number :"+x);
	}
public static void main(String args[])
	{
		exe ob1=new exe();
		new exe();
		exe ob2=new exe();
		ob1.Read();
		ob2.Read();
	}
}