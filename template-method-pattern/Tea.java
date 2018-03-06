import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends Beverage{

	void addCondiments() {
		System.out.println("Adding lemon.");
	}

	void brew() {
		System.out.println("Steeping teabag.");		
	}
	
	/*
	 * Evaluates string from getUserInput
	 * void -> boolean
	 */	
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Asks customer if they want lemon in their tea
	 * void -> string
	 */
	private String getUserInput() {
		String answer = null;
		
		System.out.println("Would you like some lemon with your tea?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = br.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error when trying to read answer");			
		}
		if(answer == null) {
			return "no";
		}
		return answer;
	}
}
