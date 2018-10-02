package lab03_bt3_myhome;

public class Vehicle {
	private String brand;
	private String number;
	private String type;
	private int cc;
	private int maxSpeed;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	//Constructor
	Vehicle(){
		this.brand= "unknown";
		this.cc = 50;
		this.type = "motobike";
		this.number = "0000";
		this.maxSpeed = 100;
	}
	Vehicle(String t,String b){
		this.brand= b;
		this.cc = 50;
		this.type = t;
		this.number = "0000";
		this.maxSpeed = 100;
	}
	
	
}
