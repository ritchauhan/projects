package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharacterLineStreamDemo {

	public static void main(String[] args) throws IOException {
		// copy character lines
		copyLines();

	}

	static void copyLines() throws IOException {
		
		BufferedReader bufferedReader = null;
		PrintWriter printWriter = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader("test.txt"));
			printWriter = new PrintWriter(new FileWriter("CharLineOut.txt"));
			String line = null;
			while((line = bufferedReader.readLine()) !=null) {
				System.out.println(line);
				printWriter.write(line);
			}
			
		} catch (IOException ioException) {
			ioException.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
			if(printWriter != null) {
				printWriter.close();
			}
		}
	}
}
