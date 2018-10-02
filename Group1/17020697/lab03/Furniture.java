package lab03_bt3_myhome;

public class Furniture {
	private String name;
	private String brand;
	private String colour;
	private int height;
	private int width;
	private String style;
	private String meterial;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMeterial() {
		return meterial;
	}
	public void setMeterial(String meterial) {
		this.meterial = meterial;
	}
	//Constructor
	
		Furniture(){
			this.name = "unknown";
			this.brand = "unknown";
			this.colour = "unknown";
			this.height = 30;
			this.width = 30;
			this.style = "smart TV";
			this.meterial = "unknown";
		}
		Furniture(String n){
			this.name = n;
			this.brand = "unknown";
			this.colour = "unknown";
			this.height = 30;
			this.width = 30;
			this.style = "smart TV";
			this.meterial = "unknown";
		}
		
		
}
