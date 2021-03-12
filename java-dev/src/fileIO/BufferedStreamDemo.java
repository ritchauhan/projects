package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo {

	public static void main(String[] args) throws IOException {
		// Buffered stream 
		copyBuffer();

	}
	
	static void copyBuffer() throws IOException {
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader("test.txt"));
			bufferedWriter = new BufferedWriter(new FileWriter("bufferedOut.txt"));
			String line = null;
			while((line = bufferedReader.readLine()) !=null) {
				System.out.println(line);
				bufferedWriter.write(line);
				bufferedWriter.write("\n");
			}
		} catch (IOException ioException) {
			System.out.println(ioException.getMessage());
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
			if(bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}

}
