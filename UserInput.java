import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

	InputStreamReader s;

	public UserInput() {
		s = new InputStreamReader(System.in);
	}

	public int readInt() {

		int userInput = 0;
		try {
			if (s.ready()) {
				try {
					
					while(!s.ready()){}
					userInput = s.read();

				} catch (NumberFormatException ex) {
					System.out.println("ENTER VALID INTEGER");
					userInput = readInt();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return userInput;
	}

	public String readString() {
		char[] userInput = new char[40];

		String userString = null;

		try {
			while (!s.ready()) {
			}
			s.read(userInput);

		} catch (IOException e) {

			e.printStackTrace();
		}

		userString = new String(userInput);
		userString = userString.trim();

		while (userString.isEmpty()) {
			System.out.println("NOT EMPTY");
			userString = readString();
		}

		return userString;
	}

	public char readChar() {
		char userInput;

		userInput = readString().charAt(0);

		return userInput;
	}
}
