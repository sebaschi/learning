package collects;


public class Main {
	
	public static void print(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Theatre corso = new Theatre("Corso", 8, 12);
		corso.getSeats();
		if(corso.reserveSeat("H11")) {
			print("please pay ");
		} else {
			print("sorry seat is taken");
		}
		if(corso.reserveSeat("H11")) {
			print("please pay ");
		} else {
			print("sorry seat is taken");
		}
		int[] zero = { };
	System.out.println(zero);
	}

}
