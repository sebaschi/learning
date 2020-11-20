package OOPS1;

public class StudentUse {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(source);
		System.out.println(Student.getNumStudent());
		Student s1;
		s1 = new Student("seb");
		Student s2 = new Student("Soph \" almost thirty\" Silverstein");
		s1.print();
		s2.print();
		System.out.println(Student.getNumStudent());
		System.out.println(Student.getNumStudent());
		
		Student s3 = new Student("arakesh");
		s3.print();
		System.out.println(Student.getNumStudent());
//		System.out.println(s3.getNumStudent());		// Not ideal to access it via the object since it is a static variable
		
		
//		System.out.println("S1" + s1);
//		s1.name = "Soph";
//		s1.rollNumber = 206;
//		s1.setRollNumber(100);

		
//		s2.name = "Seb";
//		s2.setRollNumber(206);
//		s2.rollNumber = 206;
	
		

	}

}
