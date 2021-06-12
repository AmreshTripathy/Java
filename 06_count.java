class count
{
	static int cnt;
	static public void Read()
	{
		cnt++;
		System.out.println("object number is "+cnt);
	}
	public static void main(String args[])
	{
	count.Read();//classname.staticmemberfun()
	count.Read();
	count.Read();
	}
}