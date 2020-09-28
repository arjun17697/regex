package usecase;
import java.util.*;


import java.util.regex.*;

public class uc2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Pattern pattern = Pattern.compile("[^a-zA-z0][0-9]{5}");
		System.out.println("Please feed in the string");
		String sac=sc.next();
		
		Matcher matcher = pattern.matcher(sac);
		System.out.println("Input String matches regex - "+matcher.matches());
	

	}

}


