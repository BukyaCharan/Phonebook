package csea;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream.GetField;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Spliterator;

public class Phonebooks 
{

	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace23\\cseb\\src\\cseb\\ph.txt");
			Scanner sc=new Scanner(fis).useDelimiter("\t");
			Hashtable<String, String>ht=new Hashtable<String, String>();
			String[]strarray;
			String a,str;
	        while (sc.hasNext())
	        {
	        	a=sc.nextLine();
	        strarray=a.split("\t");
	        ht.put(strarray[0], strarray[1]);
	        System.out.println("hashtable values are"+strarray[0]+":"+strarray[1]);
	        }
	        Scanner s=new Scanner(System.in);
			System.out.println("enter the name as given in the phone book");
			str=s.next();
			if (ht.containsKey(str))
				{
				System.out.println("phone n.o is"+ht.get(str));
				}
			else
			{
				System.out.println("name is not matched");
			}
		
			
			
		}
		catch (FileNotFoundException ed)
		{
		
		System.out.println(ed.getMessage());	
		}
	}

}
