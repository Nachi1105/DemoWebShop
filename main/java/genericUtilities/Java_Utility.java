package genericUtilities;

import java.util.Date;

public class Java_Utility {

	public static String getName() {
		
		String name = new Date().toString().replace(' ', '_').replace(':', '_');
		return name;
		
	}
}