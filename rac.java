import java.io.*;
importjava.net.*;
class address
{
   public staticvoidmain(String args[])throws IOException
{
   URL obj=new URL("http://dreamtech.com/index.html");
   System.out.println("protocol" +obj.getprotocol());
   System.out.println("hodt"+obj.gethost());
   System.out.println("file"+obj.getFile());
   System.out.println("port"+obj.getPort());
   System.out.println("path"+obj.getPath());
}
}