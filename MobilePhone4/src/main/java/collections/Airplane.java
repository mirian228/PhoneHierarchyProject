package collections;

import java.util.HashSet;
import java.util.Iterator;


public class Airplane {
	
	private HashSet<String> plane = new HashSet<String>();
	
	
	public Airplane() {
		
	}
	
	public void addPlane(String planeModel) {
		plane.add(planeModel);
		
	}
	
	
	public HashSet<String> getPlane() {
		return plane;
	}



	public void iteratePlane() {
		Iterator<String> itr = plane.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
	}
	
	
}
