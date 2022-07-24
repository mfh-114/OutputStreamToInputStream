package org.mfh114.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * This class represents to read the data from {@link InputStream} and display
 * on the console.
 * 
 * @author Firoj
 *
 */
public class TextReader {

	private InputStream is;

	public TextReader(InputStream is) {
		this.is = is;
	}

	/**
	 * Print the data on the console, after reading data from injected the
	 * {@link InputStream}. In the real life, Framework performs the reading
	 * operation or download operation.
	 * 
	 * @throws IOException
	 */
	public void print() throws IOException {

		int bufferSize = 1024;
		char[] buffer = new char[bufferSize];
		StringBuilder out = new StringBuilder();
		Reader in = new InputStreamReader(is);
		for (int numRead; (numRead = in.read(buffer, 0, buffer.length)) > 0;) {
			out.append(buffer, 0, numRead);
		}
		System.out.print(out.toString());
		is.close();
	}
}
