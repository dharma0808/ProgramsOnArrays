package ctsdemoNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RetainAll {
	public static void main(String[] args) throws CloneNotSupportedException 
    {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("Alekya", "Bala", "Alekya", "Dharma", "Alekya"));
         
        System.out.println(alphabets);
         
        alphabets.retainAll(Collections.singleton("Alekya"));
         
        System.out.println(alphabets);
    }
}
