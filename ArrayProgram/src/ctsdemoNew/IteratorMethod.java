package ctsdemoNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
public class IteratorMethod 
{
	public static void main(String[] args) 
    {
        ArrayList<String> abcd = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
         
    ListIterator<String> listItr = abcd.listIterator();
         
        System.out.println("===========Forward=========");
         
        while(listItr.hasNext())
        {
            System.out.println(listItr.next());
        }
         
        System.out.println("===========Backward=========");
         
        while(listItr.hasPrevious()) 
        {
            System.out.println(listItr.previous());
        }
    } }
