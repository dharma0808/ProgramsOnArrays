package ctsdemoNew;
import java.util.ArrayList;
import java.util.Iterator;

public class HasNext {
	public static void main(String[] args)
	{
		ArrayList<String> list1= new ArrayList<>();
		
		list1.add("Baji");
		list1.add("Dharma");
		list1.add("sivaji");
		
		Iterator<String> i = list1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
	}
}
