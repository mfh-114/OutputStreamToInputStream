package org.mfh114.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * This class represents the simple example to convert {@link OutputStream} to
 * {@link InputStream} by
 * {@link ByteArrayOutputStream}/{@link ByteArrayInputStream}. This approach is
 * easy but not memory efficient.
 * 
 * @author Firoj
 *
 */
public class MainByteArrayDriver {

	public static void main(String[] args) throws IOException {

		TextWriter textWriterBins = new TextWriter();

		ByteArrayOutputStream bouts = new ByteArrayOutputStream();
		textWriterBins.write(bouts);

		// load the data from ByteArrayOutputStream to ByteArrayInputStream
		ByteArrayInputStream bins = new ByteArrayInputStream(bouts.toByteArray());
		TextReader textReader = new TextReader(bins);
		textReader.print();

	}

}
