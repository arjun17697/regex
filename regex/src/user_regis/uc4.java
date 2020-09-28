package user_regis;
import java.util.*;


import java.util.regex.*;

public class uc4{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Pattern pattern = Pattern.compile("^[1-9][0-9]\s[1-9][0-9]{9}");
		System.out.println("Please enter mobile number");
		String sac=sc.nextLine();
		
		Matcher matcher = pattern.matcher(sac);
		System.out.println("Input String matches regex - "+matcher.matches());
	

	}

}


