package recursion2;

public class MergeSort {
	
	public static void merge(int[] s1, int[] s2, int[] d) {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < s1.length && j < s2.length) {
			if(s1[i] <= s2[j]) {
				d[k] = s1[i];
				i++;
				k++;
			} else {
				d[k] = s2[j];
				j++;
				k++;
			}
		}
		while(i < s1.length) {
			d[k] = s1[i];
			i++;
			k++;
		}
		while(j < s2.length) {
			d[k] = s2[j];
			j++;
			k++;
		}
	}

	public static void mergeSort(int[] arr) {
		if(arr.length <= 1) {
			return;
		}
		int[] cop1 = new int[arr.length / 2];
		int[] cop2 = new int[arr.length - cop1.length];
		
		for(int i = 0; i < arr.length/2; i++) {
			cop1[i] = arr[i];
		}
		for(int i = arr.length/2; i < arr.length; i++) {
			cop2[i - arr.length/2] = arr[i];
		}
		mergeSort(cop1);
		mergeSort(cop2);
		merge(cop1, cop2, arr);
	}
}
