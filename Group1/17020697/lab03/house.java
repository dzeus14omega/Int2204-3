package lab03_bt3_myhome;

public class house {
	private int rooms;
	private int floor;
	private String colourOutSide;
	private int windows;
	private int doors;
	
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getColourOutSide() {
		return colourOutSide;
	}
	public void setColourOutSide(String colourOutSide) {
		this.colourOutSide = colourOutSide;
	}
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	// Constructor
	
	house(){
		this.rooms = 5;
		this.doors = 5;
		this.colourOutSide = "unknown";
		this.windows = 5;
		this.floor = 2;
	}
}
