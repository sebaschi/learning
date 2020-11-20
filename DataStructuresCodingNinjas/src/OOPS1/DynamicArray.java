package OOPS1;

public class DynamicArray {

	private int[] data;
	private int nextElementIndex;

	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}

	public void add(int i) {
		if(nextElementIndex == data.length) {
			doubleCapacity();
		}
		data[nextElementIndex] = i;
		nextElementIndex++;

	}

	public void add(int i, int n) {
		for(int j = nextElementIndex-1; j >= i; j--) {
			data[j+1] = data[j];
		}
		data[i] = n;
	}

	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}

	public int size() {
		return nextElementIndex;
	}



	public boolean isEmpty() {
		return nextElementIndex == 0;
	}

	public int removeLast() {
		if(nextElementIndex == 0) {
			return -1;
		}
		int temp = data[nextElementIndex - 1];
		data[nextElementIndex-1] = 0;
		nextElementIndex--;
		return temp;

	}

	//Getter and Setter
	public int get(int i) {
		if( i >= nextElementIndex) {
			// Throw Error
			return -1;
		}
		return data[i];
	}

	public void set(int i, int j) {
		while(i >= data.length) {
			doubleCapacity();
		}
		data[i] = j;

	}
}
