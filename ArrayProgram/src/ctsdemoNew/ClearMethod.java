package ctsdemoNew;

import java.util.ArrayList;

public class ClearMethod {
	
	public static void main(String[] args) 
    {
        ArrayList<String> arrayList = new ArrayList<>(); 
         
        arrayList.add("Alekya");
        arrayList.add("Bala");
        arrayList.add("Chaitu");
        arrayList.add("Dharma");
         
        System.out.println(arrayList);   
         
        arrayList.clear();
         
        System.out.println(arrayList);   
    }
}

