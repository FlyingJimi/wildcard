package dto;

import java.io.IOException;
import java.io.Writer;

public class Test{
	
	
	public static void main(String[] args) {
		Writer writer2 = Writer2.getWriter();
		
		try {
			writer2.write("TETSTESTSTSTET");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
