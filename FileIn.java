import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileIn {
	String[] wordHolder;
	
	public FileIn(){
		File file = new File("resources\\words.txt");
		
		Reader read = null;
		
		BufferedReader readFile = null;
		
		int count = 0;
		
		wordHolder = null;
		
		try {
			read = new FileReader(file);
			readFile = new BufferedReader(read);
			
			readFile.mark(0);
			
			while(readFile.readLine() != null){
				count++;
			}
			
			wordHolder = new String[count];
			readFile = new BufferedReader(new FileReader(file));
			
			for(int i = 0; i < count; i++){
				wordHolder[i] = readFile.readLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public String[] getWordHolder(){
		return this.wordHolder;
	}
}
