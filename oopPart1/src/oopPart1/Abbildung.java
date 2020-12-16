package oopPart1;

import java.util.*;

public class Abbildung {
	
	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		
		//f("LinAlg") = 5.0)
		map.put("LinAlg", 5.0);
		map.put("DiskMath", 5.0);
		map.put("AnD", 4.75);
		map.put("EPRog", 6.0);
		
		Iterator<String> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			
			System.out.println("Im Fach " + str + " haben sie die Note: " + map.get(str));
		}
		
		
	}

}
