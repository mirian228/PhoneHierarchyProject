package collections;

import java.util.ArrayList;

public class Car {
	ArrayList<String> list;
	
	public Car(){
		
	}
	
	
	public void addCarModel(String model) {
		list.add(model);
	}
	
	public void deleteCarModel(String model) {
		list.remove(model);
	}
	


	public String getCarModel(int index) {
		return list.get(index);
	}
	
	public String setCarModel(int index, String model) {
		list.set(index, model);
		return list.get(index);
	}
	
	public boolean clearList() {
		list.clear();
		return true;
	}
	
	
	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	
	
}
