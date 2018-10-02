package lab03_bt3_myhome;


public class Person {
	private String name;
	private boolean sex; //male 1 ;female 0
	private String job;
	private int DOB;     //date of birth
	private int height;
	
	
	//getter/setter
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//Constructor
		Person(){
			this.sex = true;
			this.DOB = 2000;
			this.job = "unknown";
			this.height = 180;
		}
		Person(String n, boolean s){
			this.sex = s;
			this.DOB = 2000;
			this.job = "unknown";
			this.height = 180;
			this.name = n;
		}
		
	
}
