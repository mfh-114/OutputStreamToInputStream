package org.mfh114.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * This class represents the simple example to convert {@link OutputStream} to
 * {@link InputStream} by {@link PipedOutputStream}/{@link PipedInputStream}.
 * This approach is little complex but memory efficient.
 * 
 * @author Firoj
 *
 */
public class MainPipedDriver {

	public static void main(String[] args) throws IOException {

		TextWriter textWriterPiped = new TextWriter();
		PipedOutputStream pipedOut = new PipedOutputStream();
		PipedInputStream pipedIS = new PipedInputStream(pipedOut, 8000);

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new PipedStreamRunable(textWriterPiped, pipedOut));
		executorService.shutdown();

		TextReader textReaderPiped = new TextReader(pipedIS);
		textReaderPiped.print();
	}

}
