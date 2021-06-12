class overload
{
	int  x,y,z;//instance variable
	overload()
	{
		x=y=z=0;
		System.out.println("no arg");
	}
	void overload(int a) { System.out.println(a);}
	void overload(int a,int b) { System.out.println(a+b);}
	void overload(int a,int b,int c) { System.out.println(a+b+c);}
	
	{
		overload ob=new overload();//object construct
		overload ob1=new overload(A);
		overload ob2=new overload(10,20);
		overload ob3=new overload(10,20,30);
	}
}