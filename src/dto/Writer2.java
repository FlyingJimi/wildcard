package dto;

import java.io.IOException;
import java.io.Writer;

public class Writer2 extends Writer{
	Writer subWriter;
	
	public Writer2(Writer writer){
		this.subWriter = writer;
		System.out.println();
	}
	
	public static Writer getWriter(){
		Writer writer2 = new Writer2(Writer1.getWriter());
		return writer2;
	}
	
	@Override
	public void write(String str) throws IOException {
		synchronized (subWriter) {
			System.out.println("writer2 : " + str);
		}
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
