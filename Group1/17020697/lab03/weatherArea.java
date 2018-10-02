package lab03_bt3_myhome;

public class weatherArea {
	private String TrangThai;
	private int temperature;
	private int humid;
	public String getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getHumid() {
		return humid;
	}
	public void setHumid(int humid) {
		this.humid = humid;
	}
	//Constructor
	
	weatherArea(){
		this.TrangThai = "normal";
		this.humid = 15;
		this.temperature = 25;
	}
	
}
