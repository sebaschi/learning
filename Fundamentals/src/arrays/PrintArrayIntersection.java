package arrays;
import java.util.*;
public class PrintArrayIntersection {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
//			int counter = 0;
//			if (counter > shortHelp.length) {
//				return;
//			}	counter++;
	
	public static void intersections1(int[] arr1, int[] arr2) {

		int[] longHelp;
		int[] shortHelp;

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (arr1.length >= arr2.length) {
			longHelp =arr1;
			shortHelp = arr2;
		} else {
			longHelp = arr2;
			shortHelp = arr1;
		}

		int counter = 0;
		
		for(int i = 0; i < shortHelp.length; i++){
			counter = 0;

			for(int j = i; j < longHelp.length; j++)  {
				if (counter > 0) {
					continue;
				}else if(shortHelp[i] == longHelp[j]) {
					System.out.println(shortHelp[i]);
					break;
				}
			}
		}
	}
	
	public static void intersections(int[] arr1, int[] arr2) {

	for(int i = 0; i < arr1.length; i++){
	
			for(int j = 0; j < arr2.length; j++)  {
				 if(arr1[i] == arr2[j]) {
					 arr2[j] = Integer.MIN_VALUE;
					System.out.println(arr1[i]);
					
				}
			}
		}
	}


	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		//Arrays.sort(arr2);
	//	System.out.println(Arrays.toString(arr2));
		intersections(arr1, arr2);
	}

}
