
public class Controller {
	String[] wordHolder;
	FileIn reader;
	UserInput inputReader;
	
	public Controller(){
		wordHolder = new FileIn().getWordHolder();
		inputReader = new UserInput();
		char Ble = inputReader.readChar();
		System.out.println(Ble);
	}
}
