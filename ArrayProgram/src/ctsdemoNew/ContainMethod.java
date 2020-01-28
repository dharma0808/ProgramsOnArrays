package ctsdemoNew;

import java.util.ArrayList;

public class ContainMethod {
	
	public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(2);
         
        list.add("America");
        list.add("Banglore");
        list.add("Chennai");
        list.add("Delhi");
         
        System.out.println( list.contains("America") );       //true
         
        System.out.println( list.contains("Zeel") );       //false
    }
}
	

