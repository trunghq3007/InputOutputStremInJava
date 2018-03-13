/**
 * 
 */
package character.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @description:
 * @author: Admin
 * @time: 1:58:55 PM
 * @date: Mar 12, 2018
 */
public class CharacterStream {
	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader("inStream.txt");
			out = new FileWriter("outStream.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println(" character stream done!!!");
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
