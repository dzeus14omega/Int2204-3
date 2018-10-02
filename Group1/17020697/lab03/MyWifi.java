package lab03_bt3_myhome;

public class MyWifi {
	private String internetHost;
	private String nameRouter;
	private double maxSpeedUp;
	private double maxSpeedDown;
	public String getInternetHost() {
		return internetHost;
	}
	public void setInternetHost(String internetHost) {
		this.internetHost = internetHost;
	}
	public String getNameRouter() {
		return nameRouter;
	}
	public void setNameRouter(String nameRouter) {
		this.nameRouter = nameRouter;
	}
	public double getMaxSpeedUp() {
		return maxSpeedUp;
	}
	public void setMaxSpeedUp(double maxSpeedUp) {
		this.maxSpeedUp = maxSpeedUp;
	}
	public double getMaxSpeedDown() {
		return maxSpeedDown;
	}
	public void setMaxSpeedDown(double maxSpeedDown) {
		this.maxSpeedDown = maxSpeedDown;
	}
	
	//Constructor
	MyWifi(String n) {
		// TODO Auto-generated constructor stub
		this.nameRouter = "tp-link";
		this.internetHost = "vnpt";
		this.maxSpeedDown = 50.5;
		this.maxSpeedUp = 70.2;
	}
	
	
}
