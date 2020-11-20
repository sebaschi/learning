package recursion2;

public class QuickSort {

	public static void quickSort(int[] a) {
		if(a.length <= 1) {
			return;
		}
	}
	public static void quicksort(int[] a, int s, int e) {
		if(s >= e) {
			return;
		}
		int pivotIndex = partition(a, s, e);
		quicksort(a, s, pivotIndex-1);
		quicksort(a, pivotIndex + 1, e);
	}

	public static int partition(int[] a, int si, int ei) {
		int p = a[si];
		int counter = 0;
		for(int i = si + 1; i <= ei; i++) {
			if(a[i]<p) {
				counter++;
			}
		}

		int temp = a[counter + si];
		a[counter + si] = p;
		a[si] = temp;

		int i = si;
		int j = ei;
		while(i < j) {
			if(a[i] < p) {
				i++;
			} else if (a[j] >= p) {
				j--;
			} else {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		return counter + si;
	}
}

