import java.util.*;

public class StringReverser {
	public static void main(String[] args) {
		String userInput = "";
		Scanner scan = new Scanner(System.in);
		userInput = scan.nextLine();
		String output = "";
		
		for (int i = userInput.length() - 1; i >= 0; i--) {
			output += userInput.charAt(i);
		}
		
		System.out.println(output);
		scan.close();
	}
}
