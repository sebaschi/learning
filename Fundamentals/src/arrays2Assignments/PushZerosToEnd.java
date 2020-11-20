package arrays2Assignments;

public class PushZerosToEnd {

	// This method will push all zeros to the end while maintaining the order of the other elements
	// Works but gets about 50% Time Limit Exceeded error!
	public static void pushZerosAtEnd(int[] arr) {
		int n = arr.length;
		int i = 0;
		int j = 0;

		while (i<n){
			if(arr[i]==0) {
				j = i;
				while(j<n) {
					if(arr[j] != 0) {
						arr[i] = arr[j];
						arr[j] = 0;
						break;
					}
					j++;
				}
			} 
			i++;
		}
	}

	//Works but also get 50% time exceeding error
	public static void pushZerosAtEnd2(int[] arr) {

		int n = arr.length;


		for(int i = 0; i < n; i++) {
			if (arr[i]==0) {
				for (int j = i; j < n; j++){
					if(arr[j] != 0) {
						arr[i] = arr[j];
						arr[j] = 0;
						break;
					}
				}
			}
		}
	}

	//Version found online that didn't exceed time-limit!
	public static void pushZerosToEnd(int[] arr) {

		int n = arr.length;

        int count = 0;  // Count of non-zero elements 
        
        // Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element 
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i]; // here count is 
                                       // incremented 
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < n) 
            arr[count++] = 0; 




	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
	        int n = arr.length; 
	        pushZerosToEnd(arr); 
	        System.out.println("Array after pushing zeros to the back: "); 
	        for (int i=0; i<n; i++) 
	            System.out.print(arr[i]+" ");

	}

}
