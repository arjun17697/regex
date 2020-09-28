package user_regis;
import java.util.*;


import java.util.regex.*;

public class uc2{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
		System.out.println("Please enter last name");
		String sac=sc.next();
		
		Matcher matcher = pattern.matcher(sac);
		System.out.println("Input String matches regex - "+matcher.matches());
	

	}

}


