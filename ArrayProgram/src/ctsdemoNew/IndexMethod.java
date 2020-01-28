package ctsdemoNew;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexMethod {

	 public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(Arrays.asList("alekya", "bala", "chaitu","dharma","bala","mouni","bala","bindu"));
	         
	        int firstIndex = list.indexOf("bala");
	         
	        System.out.println(firstIndex);
	         
	        firstIndex = list.indexOf("teja");
	         
	        System.out.println(firstIndex);
	    }
	}
