package NumberOfInversions;

public class Number_Of_Inversions {


	  

	    public static void main(String[] args) {
	      
	      
	        // Uncomment this line if you want to read from a file
	        
	    	int[] array = {74, 43, 32, 3, 50, 62, 9, 66, 86, 87};
	        System.out.println(number_of_inversion(array));
	        
	        
	        
	        // Uncomment this line if you want to read from a file
	        
	    }
	    
	    private static int number_of_inversion(int [] array) {
	        return mergeSortCount(array, 0, array.length-1);
	 
	    }
	    
	     private static int mergeSortCount (int[] arr, int left, int right) {
	        if (left == right){
	           return 0;
	          
	        }
	        int middle = (right + left)/2;

	        int count1 = mergeSortCount (arr, left, middle);
	        int count2 = mergeSortCount (arr, middle+1, right);
	        int count3 = mergeCount (arr, left, middle, right);
	        return count1 + count2 + count3;
	    }

	    private static int mergeCount (int[] a, int left, int middle, int right) {
	        int count = 0;
	        
	        int i = left;
	        int j = middle + 1;
	        int k = 0;
	        
	        int[] buffer = new int[right-left + 1];
	        
	        while(i <= middle && j <= right){
	          if(a[i] <= a[j]){
	            buffer[k] = a[i];
	            i++;
	          } else {
	            buffer[k] = a[j];
	            j++;
	            count += (middle + 1 - i); //do not understand 100%
	          }
	          k++;
	        }
	        
	        while(i <= middle){
	          buffer[k] = a[i];
	          i++;
	          k++;
	        }
	        while(j <= right){
	          buffer[k] = a[j];
	          j++;
	          k++;
	        }
	        
	        for(int l = left; l <= right; l++){
	          a[l] = buffer[l - left];
	        }
	        
	        return count;
	    }
	    
	


}
