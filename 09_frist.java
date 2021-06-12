class frist
{
	//instance variables
	//not allowed to asssign
	int x;
	String y;
	float z;
	void get(int a,String b,float c)
	{
		x=a;y=b;z=c;
	}
	void set()
	{
		System.out.print(x+" "+y+" "+z);
	}
	public static void main(String args[])
	{
	frist ob=new frist();
	ob.x=10;
	frist ob1=new frist(),ob2=new frist();
	ob.get(10,"giet",10.50f );
	ob1.get(20,"gift",20.00f );
	ob2.get(30,"gita",30.00f);
	ob.set();
	ob1.set();
	ob2.set();
	//asssignment and prinr put in a get and set method
	}
}