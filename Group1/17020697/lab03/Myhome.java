package lab03_bt3_myhome;

import java.util.ArrayList;

public class Myhome {
	ArrayList <Furniture> Furnitures;
	ArrayList <Vehicle> vehicles;
	weatherArea homeWeather;
	ArrayList <Person> myFamily;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myhome myhome = new Myhome();
		myhome.Furnitures = new ArrayList<>();
		myhome.Furnitures.add(new Furniture("TV"));
		myhome.Furnitures.add(new Furniture("frigde"));
		myhome.Furnitures.add(new Furniture("table"));
		myhome.Furnitures.add(new Furniture("desktop"));
		myhome.Furnitures.add(new Furniture("fan"));
		
		myhome.vehicles = new ArrayList<>();
		myhome.vehicles.add(new Vehicle("motobike","honda"));
		myhome.vehicles.add(new Vehicle("car","mercedes"));
		
		myhome.myFamily = new ArrayList <>();
		myhome.myFamily.add(new Person("myDad",true));
		myhome.myFamily.add(new Person("myMon",false));
		myhome.myFamily.add(new Person("mySister",false));
		
	}

}
