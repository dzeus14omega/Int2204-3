package lab03_bt3_myhome;

public class Nature {
	private String name;
	private String shape;
	private int weight;
	private int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//Constructor
	Nature(String n) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.height = 0;
		this.weight = 0;
		this.shape = "undefine";
	}
	
}
