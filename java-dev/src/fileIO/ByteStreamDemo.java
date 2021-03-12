package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		// calling file read write methods
		byteFileMethods();
	}	
	
	static void byteFileMethods() throws IOException {
		
		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		try {
			inputStream = new FileInputStream("test.txt");
			outputStream = new FileOutputStream("output.txt");
			int text;
			while ((text = inputStream.read()) != -1) {
				System.out.println(text);
				outputStream.write(text);
			}
		} catch (IOException ioException) {
			System.out.println(ioException);
		} finally {
			if(inputStream != null) {
				inputStream.close();
			}
			if(outputStream != null) {
				outputStream.close();
			}
		}
	}

}
