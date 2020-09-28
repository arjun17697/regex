package usecase;
import java.util.*;


import java.util.regex.*;

public class uc4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Pattern pattern = Pattern.compile("^[0-9]{3}?(\s)[0-9]{3}$");
		System.out.println("Please feed in the string");
		String sac=sc.nextLine();
		
		Matcher matcher = pattern.matcher(sac);
		System.out.println("Input String matches regex - "+matcher.matches());
		// bad regular expression
				//pattern = Pattern.compile("*xx*");
	

	}

}


