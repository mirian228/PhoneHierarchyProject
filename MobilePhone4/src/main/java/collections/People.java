package collections;

import java.util.Queue;

public class People {
	
	private Queue<String> people;
	
	public People(){
		
	}
	
	public void addNewPersonToQueue(String name) {
		people.add(name);
	}
	
	public void removeFirstPersonFromQueue(String name) {
		people.poll();
	}
	
	public void getFirstPersonFromQueue(String name) {
		people.peek();
	}

	public Queue<String> getPeople() {
		return people;
	}

	public void setPeople(Queue<String> people) {
		this.people = people;
	}
	
	
	
}
