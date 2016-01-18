package dto;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Airplane {
	
	public static String id;
	public String start;
	public String end;
	
	public static Airplane getAirplane(){
		System.out.println("getAirplane호출됨");
		return new Airplane();
	}
	
	public static Airplane getAirplane(String start){
		return new Airplane(start);
	}
	
	public static Airplane getAirplane(String start, String end){
		return new Airplane(start, end);
	}
	
	public Airplane(){
		id = "WildPlane";
		start = "ICN";
	}
	
	public Airplane(String start){
		id = "WildPlane";
		this.start = start;
	}
	
	public Airplane(String start, String end){
		id = "WildPlane";
		this.start = start;
		this.end = end;
	}
	
	public void setEnd(String end){
		this.end = end;
	}
	
	public String getEnd(){
		return end;
	}
	
	public void go(){
		this.start = this.end;
		this.end = "";
	}
	
	public String getStart(){
		return start;
	}
	
	public List<LocationDTO> getList(){
		return checkList(makeList(getConnection()));
	}
	
	public Connection getConnection(){
		return null;
	}
	
	public List<LocationDTO> makeList(Connection con){
		List<LocationDTO> list = new ArrayList<LocationDTO>();
		//가져오는 부분
		return list;
	}
	
	public List<LocationDTO> checkList(List<LocationDTO> list){
		//리스트 비교해서 출발지인거 빼기
		return list;
	}
}
