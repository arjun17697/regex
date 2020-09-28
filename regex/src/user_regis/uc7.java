package user_regis;
import java.util.*;


import java.util.regex.*;

public class uc7{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[A-Z]).{8,}$");
		System.out.println("Please enter password");
		String sac=sc.nextLine();
		
		Matcher matcher = pattern.matcher(sac);
		System.out.println("Input String matches regex - "+matcher.matches());
	

	}

}


