import java.io.*;
import java.net.*;
class a
{
	public static void main(String arg[])throws IOException
	{
		URL obj=new URL("http://dreamtech.com/index.html");
		System.out.println("protocol"+obj.getProtocol());
		System.out.println("host"+obj.getHost());
		System.out.println("file"+obj.getFile());
		System.out.println("port"+obj.getPort());
		System.out.println("path"+obj.getPath());
	}
}