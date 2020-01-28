package ctsdemoNew;

import java.util.ArrayList;

public class EnsureCapacity1 {
	
	 public static void main(String[] args) {
		 
		  
		      ArrayList<String> StudentList = new ArrayList<String>(0);
		      
		       StudentList.add("Dharma");
		       StudentList.add("Taruni");
		       StudentList.add("Ramprasadh");
		       StudentList.add("Pavan");
		  
		  StudentList.ensureCapacity(10);

		      StudentList.add("Venkata Ananth");
		   
		      for (String s: StudentList) {
		            System.out.println(s);
		      }
		   }

}
