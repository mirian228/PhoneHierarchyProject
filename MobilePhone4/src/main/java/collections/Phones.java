package collections;

import java.util.HashMap;

public class Phones {
	private HashMap<String, String> phone = new HashMap<String, String>();
	
	public Phones(){
		
	}
	
	public void addPhone(String brandName, String model) {
		phone.put(brandName, model);
	}
	
	public void removePhone(String brandName) {
		phone.remove(brandName);
		
	}
	
	public void hasPhone(String brandName) {
		phone.containsKey(brandName);
	}
	
	
	
}
