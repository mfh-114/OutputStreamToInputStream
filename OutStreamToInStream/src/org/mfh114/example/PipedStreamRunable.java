package org.mfh114.example;

import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedStreamRunable implements Runnable{

	private final PipedOutputStream outputStream;
	private final TextWriter textWriter;
	
	public PipedStreamRunable(final TextWriter textWriter, final PipedOutputStream outputStream) {
		this.outputStream = outputStream;
		this.textWriter = textWriter;
	}
	
	@Override
	public void run() {
		
		try {
			
			textWriter.write(outputStream);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
