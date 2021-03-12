package fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

	public static void main(String[] args) throws IOException {
		// Reading character stream
		copyCharacter();

	}
	
	static void copyCharacter() throws IOException {
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		
		try {
			fileReader = new FileReader("test.txt");
			fileWriter = new FileWriter("charOutput.txt");
			int i;
			while((i = fileReader.read()) != -1) {
				System.out.println(i);
				fileWriter.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fileReader != null) {
				fileReader.close();
			}
			if(fileWriter != null) {
				fileWriter.close();
			}
		}
	}
}
