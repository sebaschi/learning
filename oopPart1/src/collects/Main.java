package collects;

import java.util.*;

public class Main {

	public static void print(String s) {
		System.out.println(s);
	}
//		Theatre corso = new Theatre("Corso", 8, 12);
//		//		corso.getSeats();
//		if(corso.reserveSeat("B13")) {
//			print("please pay ");
//		} else {
//			print("sorry seat is taken");
//		}
//		
//		if(corso.reserveSeat("H11")) {
//			print("please pay ");
//		} else {
//			print("sorry seat is taken");
//		}
	public static void main(String[] args) {

		Theatre theatre = new Theatre ("Olympian", 8, 12);
		List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
		printList(seatCopy);
		
		seatCopy.get(1).reserve();
		if(theatre.reserveSeat("A02")) {
			System.out.println("PLease pay for A02");
		} else {
			System.out.println("Seat already reserved");
		}
		System.out.println();
		Collections.shuffle(seatCopy);
		System.out.println("Printing seatCopy");
		printList(seatCopy);
		System.out.println("Printing theatre.seats");
		printList(theatre.seats);
		
		Theatre.Seat minSeat = Collections.min(seatCopy);
		Theatre.Seat maxSeat = Collections.max(seatCopy);
		System.out.println("minseat is " + minSeat.getSeatNumber());
		System.out.println("maxseat is " + maxSeat.getSeatNumber());
		System.out.println();
		sortList(seatCopy);
		System.out.println("Printing seatCopy");
		printList(seatCopy);
		
		List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
		Collections.copy(newList, theatre.seats);
}
	
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat : list) {
			System.out.print(" " + seat.getSeatNumber());
		}
		System.out.println();
		System.out.println("============================================================================");
	}
	
	public static void sortList(List<? extends Theatre.Seat> list) {
		for(int i = 0; i < list.size()-1;i++) {
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(i).compareTo(list.get(j)) > 0) {
					Collections.swap(list, i, j);
				}
			}
		}
	}
}
