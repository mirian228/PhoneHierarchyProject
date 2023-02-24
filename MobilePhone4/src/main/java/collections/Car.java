package collections;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
	ArrayList<String> list;

	public Car() {

	}

	public void addCarModel(String model) {
		list.add(model);
	}

	@Override
	public int hashCode() {
		return Objects.hash(list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(list, other.list);
	}

	@Override
	public String toString() {
		return "Car [list=" + list + "]";
	}

	public Car(ArrayList<String> list) {
		super();
		this.list = list;
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
