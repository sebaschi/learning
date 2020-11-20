package linkedList1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(100);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1, 80);
		arr.remove(2); //at index
//		Integer i = 10; removes a specific object
//		arr.remove(i);

		arr.add(987);
		arr.set(0, 100); // replaces without leftshift! Size of AL wont change
		System.out.println(arr.size());
		System.out.println(arr.get(3));
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		// Enhanced for loop - for each loop. Not good to use when changeing elemtns in the AL
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
