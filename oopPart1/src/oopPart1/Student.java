package oopPart1;

public class Student implements Comparable<Student>{
	
	int nr;
	double note1;
	double note2;
	double note3;
	
	public Student(int nr, double note1, double note2, double note3) {
		this.nr = nr;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
	}

	@Override
	public int compareTo(Student other) {
		double myScore = note1 + note2 + note3;
		double otherScore = other.note1 + other.note2 + other.note3;
		
		return  (myScore - otherScore) == 0 ? 0 : (myScore - otherScore) < 0 ? -1 : 1;
	}
	
	

}
