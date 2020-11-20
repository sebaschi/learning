package timeComplexity;

public class EquillibriumIndex {
	public static int arrayEquilibrium(int[] arr){  
		
		int sumArr = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sumArr += arr[i];
		}
		
		int leftSum = 0;
		int rightSum = sumArr - arr[0];
		for(int i = 1; i < arr.length; i++) {
			leftSum += arr[i-1];
			rightSum -= arr[i];
			if(leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}
}
