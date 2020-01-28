package ctsdemoNew;

import java.util.ArrayList;
import java.util.Arrays;

public class LastIndex {
	public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("alekya", "bala", "chaitu","dharma","bala","mouni","bala","bindu"));
         
        int LastIndex = list.lastIndexOf("bala");
         
        System.out.println(LastIndex);
         
        LastIndex = list.lastIndexOf("teja");
         
        System.out.println(LastIndex);
    }
}
