package oopPart1;

import java.util.*;

public class Service {
	
	ArrayList<Student> liste;
	
	public Service(Scanner scanner) {
		liste = new ArrayList<Student>();
		
		while(scanner.hasNext()) {
			int nr = scanner.nextInt();
			double note1 = scanner.nextDouble();
			double note2 = scanner.nextDouble();
			double note3 = scanner.nextDouble();
			Student stud = new Student(nr,note1,note2,note3);
			liste.add(stud);
		}
	}
	
	public List<Integer> critical(double bound1, double bound2){
		List<Integer> crit = new ArrayList<Integer>();
		
		for(Student i : liste) {
			if(i.note1 <= bound1 && (i.note1 + i.note3) < bound2) {
				crit.add(i.nr);
			}
		}
		return crit;
	}
	
	public List<Integer> top(int limit){
		List<Integer> topStudents = new ArrayList<Integer>();
		Collections.sort(liste, Collections.reverseOrder());
		
		for(int i = 0; i < limit; i++) {
			topStudents.add(liste.get(i).nr);
		}
		
		return topStudents;
	}

}
