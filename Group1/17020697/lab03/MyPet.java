package lab03_bt3_myhome;

public class MyPet {
	private String name;
	private int age;
	private String type;
	private String colour;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	//Constructor
	MyPet(String n, String t){
		this.name = n;
		this.type = t;
		this.age = 1;
		this.colour = "white";
		
	}
	
}
