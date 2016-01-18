package dto;

public class People {
	private String name;
	private Airplane airplane;
	
	public People(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
	
	public void go(String end){
		airplane.setEnd(end);
		airplane.go();
	}
	
}
