package usecase;
import java.util.*;


import java.util.regex.*;

public class uc3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Pattern pattern = Pattern.compile("[^0][0-9]{4}[^a-zA-z0]");
		System.out.println("Please feed in the string");
		String sac=sc.next();
		
		Matcher matcher = pattern.matcher(sac);
		System.out.println("Input String matches regex - "+matcher.matches());
	

	}

}


