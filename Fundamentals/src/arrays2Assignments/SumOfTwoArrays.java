package arrays2Assignments;

public class SumOfTwoArrays {
	
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
		int length;
		int shorth;
		int[] longerArr;
	
		if(arr1.length > arr2.length) {
			length = arr1.length;	
			shorth = arr2.length;
			longerArr = arr1;
		} else {
			length = arr2.length;
			shorth = arr1.length;
			longerArr = arr2;
		}
		
		
		int[] arrS = new int[length + 1];
		
		
		int i = arr1.length-1;
		int j = arr2.length-1;
		int k = arrS.length-1;
		int num  = 0;
		int carry = 0;
		
		while(i >= 0 && j >= 0) {
			num = arr1[i]+arr2[j]+carry;
			arrS[k] = num % 10;
			carry = num/10;
			i--;
			j--;
			k--;
		}
		while(k > 0) {
			
			num = (longerArr[k-1]+carry);		// Do not understand why -1?
			arrS[k] = num%10;
			carry = num/10;
            k--;
			
		}
		return arrS;
	}

}



/*
Two random integer arrays are given A1 and A2, 
in which numbers from 0 to 9 are present at every index 
(i.e. single digit integer is present at every index of both given arrays).
You need to find sum of both the input arrays 
(like we add two integers) and put the result in another array 
i.e. output array (output arrays should also contain only single digits at every index).
The size A1 & A2 can be different.
Note : Output array size should be 1 more than the size of bigger array and place 0 at the 0th index if there is no carry.
 No need to print the elements of output array.
*/