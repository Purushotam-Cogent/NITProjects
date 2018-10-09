package nc.util;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class UtilityClasses {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		System.out.println(date.getDate()+"/"+(date.getMonth()+1)+
				"/"+(1900+date.getYear()));
		
		System.out.println("Day "+date.getDay());
		
		System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		
		
		date=new Date(107,6,12);
		

		System.out.println(date.getDate()+"/"+(date.getMonth()+1)+
				"/"+(1900+date.getYear()));
		
		System.out.println("Day "+date.getDay());
		
		System.out.println(date.getHours()+":"
		+date.getMinutes()+":"+date.getSeconds());
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		
		
		System.out.println(cal.getTime());
		
		SimpleDateFormat simple=
				new SimpleDateFormat("yyyy,MMMM,dd,G, hh:mm:ss a z");
		
		System.out.println(simple.format(cal.getTime()));
		
		String welcome="This_is_string_tokenizer_object_to_get_token_element";
		
		StringTokenizer str=new StringTokenizer(welcome,"_");
		int count=0;
		
		while(str.hasMoreTokens())
		{
			System.out.println("Token "+(++count)+" "+str.nextToken());
		}
		
		System.out.println("Binary Search "+Arrays.binarySearch
				(new int[] {-19,2,10,12,13,100}, 2));
		
		
		
		
		

		
	}

}
