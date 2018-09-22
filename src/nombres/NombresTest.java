package nombres;

import java.io.IOException;
import org.junit.Test;


public class NombresTest
{
    @Test
    public void test()
    {
	String path = "E:\\Program Files (x86)\\Programas\\Eclipse\\Workspace\\Nombres_Repetidos\\test\\";
	String file = "nombres2";
	
	try
	{
	    Nombres.resolver(path + file);
	} 
	catch (IOException e)
	{
	    System.out.println("ERROR");
	}
    }
}
