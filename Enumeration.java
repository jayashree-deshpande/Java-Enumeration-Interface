import java.util.*;

public class Enumeration{
	
	public static void main(String[] args){
		java.util.Enumeration<String> months;
		Vector<String> monthNames = new Vector<String>();
		monthNames.add("Jan");
		monthNames.add("Feb");
		monthNames.add("March");
		monthNames.add("April");
		monthNames.add("May");
		monthNames.add("June");
		monthNames.add("July");
		monthNames.add("Aug");
		monthNames.add("Sep");
		monthNames.add("Oct");
		monthNames.add("Nov");
		monthNames.add("Dec");
		
		months = monthNames.elements();
		
		while(months.hasMoreElements())
		{
			System.out.println(months.nextElement());
		}
	}
}
