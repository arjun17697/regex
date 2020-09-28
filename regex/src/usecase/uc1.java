package usecase;
import java.util.regex.*;

public class uc1 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[1-9][0-9]{5}");
		Matcher matcher = pattern.matcher("111111");
		System.out.println("Input String matches regex - "+matcher.matches());
	
	}

}