package collections;
import java.util.LinkedList;

public class Animal{
	private LinkedList<String> list = new LinkedList<String>();
	
	public Animal(){
		
	}
	

	public boolean checkForAnimal(String name) {
		if(list.contains(name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String setAnimalName(int index, String name) {
		list.set(index, name);
		return list.get(index);
	}
	
	
	public void addAnimal(String name) {
		list.add(name);
	}
	
	public void removeAnimal(String name) {
		list.remove(name);
	}
	
	public String getAnimalName(int index) {
		return list.get(index);
	}
	

	
	public LinkedList<String> getAnimals() {
		return list;
	}

	

	
	
	
}
