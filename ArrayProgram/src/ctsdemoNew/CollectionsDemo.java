package ctsdemoNew;
import java.util.ArrayList;
public class CollectionsDemo {
	
	public static void main(String args[])
	{
		ArrayList<String> list1= new ArrayList<>();
		
		list1.add("Satya");
		list1.add("Raju");
		list1.add("Baji");
		list1.add("Dharma");
		list1.add("sivaji");
		
		ArrayList<String> list2= new ArrayList<>();
		
		list2.add("TSR");
		list1.addAll(list2);
		System.out.println(list1);
	}
}
