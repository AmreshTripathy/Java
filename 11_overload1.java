class overload
{
	int  x,y,z;//instance variable
	overload()
	{
		x=y=z=0;
	}
	public void get() { System.out.println("no arg");}
	void get(int a) { System.out.println(a);}
	void get(int a,int b) { System.out.println(a+b);}
	void get(int a,int b,int c) { System.out.println(a+b+c);}
	public static void main(String args[])
	{
		overload ob=new overload();//object construct
		ob.get();
		ob.get(10);
		ob.get(10,20);
		ob.get(10,20,30);
	}
}