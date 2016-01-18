package dto;

import java.io.IOException;
import java.io.Writer;

public class Writer1 extends Writer{

	public static Writer getWriter(){
		return new Writer1();
	}
	
	@Override
	public void write(String str) throws IOException {
		System.out.println("Writer1 : " + str);
		super.write(str);
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
