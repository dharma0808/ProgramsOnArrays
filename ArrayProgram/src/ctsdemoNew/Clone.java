package ctsdemoNew;

import java.util.ArrayList;

public class Clone 
{
	public static void main(String[] args) 
    {
        ArrayList<String> Myobj = new ArrayList<>(); 
         
        Myobj.add("Alekya");
        Myobj.add("Bala morali");
        Myobj.add("Chaitnya vidya");
        Myobj.add("Dharmateja thulluru");
         
        System.out.println( Myobj);   
         
        @SuppressWarnings("unchecked")
		ArrayList<String> arrayListClone =  (ArrayList<String>)  Myobj.clone();
         
        System.out.println(arrayListClone);   
    }
	}

