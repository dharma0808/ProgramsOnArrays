package ctsdemoNew;

import java.util.ArrayList;
import java.util.Arrays;

public class GetMethod 
{
	public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Vennkatasai", "DharmaTeja", "Thulluru", "0808"));
         
        String firstName = list.get(0);         //venkatsai
        String secondName = list.get(1);        //dharmateja
         
        System.out.println(firstName);
        System.out.println(secondName);
    }
}

