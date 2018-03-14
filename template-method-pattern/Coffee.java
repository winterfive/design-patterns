import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends Beverage {

	void addCondiments() {
		System.out.println("Add sugar and milk.");
	}

	void brew() {
		System.out.println("Dripping coffee through filter.");
	}
	
	public boolean customerWantsCondiments() {
		
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		
		String answer = null;
		
		System.out.println("Would you like milk or sugar in your coffee? (y/n)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = br.readLine();
		} catch (IOException ioe) {
			System.err.print("IO error trying to read your answer.");
		}
		
		if(answer == null) {
			return "no";
		}
		return answer;
	}

}
