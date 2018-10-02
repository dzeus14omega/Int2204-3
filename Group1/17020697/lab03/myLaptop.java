package lab03_bt3_myhome;

public class myLaptop {
	private String brand;
	private String idProduct;
	private String type;
	private int Ram;
	private String CPU;
	private String hardWare;
	private int baterry;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public String getHardWare() {
		return hardWare;
	}
	public void setHardWare(String hardWare) {
		this.hardWare = hardWare;
	}
	public int getBaterry() {
		return baterry;
	}
	public void setBaterry(int baterry) {
		this.baterry = baterry;
	}
	//Constructor
	myLaptop(String b,String id){
		this.brand = "MSI";
		this.idProduct = "gl62-7rdx";
		this.baterry = 9000;
		this.type = "gaming";
		this.CPU = "intel core i7";
		this.Ram = 8;
		this.hardWare = "HDD";
	}
	
	
	
}
