/**
 * 
 */
package bytes.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: Admin
 * @time: 1:50:26 PM
 * @date: Mar 12, 2018
 */
public class Start {
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;

		try {
			inputStream = new FileInputStream("inStream.txt");
			outputStream = new FileOutputStream("outStream.txt");

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		    System.out.println(" byte stream done!!!");
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}
