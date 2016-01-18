package dto;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		try {
			Class<?> cs = Class.forName("dto.Airplane");
			Object obj = cs.newInstance();
			
			Method airplane = cs.getMethod("getAirplane");
			Object obj2 = airplane.invoke(obj);
			System.out.println(airplane.getReturnType());
			airplane.invoke(obj);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
