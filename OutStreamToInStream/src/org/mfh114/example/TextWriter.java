package org.mfh114.example;

import java.io.IOException;
import java.io.OutputStream;

/**
 * This class is responsible to write canned data by injected {@link OutputStream}.
 * This is simple example to demonstrate how to write data by
 * {@link OutputStream}.
 * 
 * @author Firoj
 *
 */
public class TextWriter {

	private String textToWrite;

	public TextWriter() {
		this.textToWrite = "Hello world... We are living in a mad world.";
	}

	/**
	 * Write data by {@link OutputStream}.
	 * 
	 * @param outputStream
	 * 
	 * @throws IOException
	 */
	public void write(OutputStream outputStream) throws IOException {
		outputStream.write(this.textToWrite.getBytes());
	}
}
