import java.util.*;

class SelectionSort{

	public static void main(String uselessArray[]){
		//hardcoded array value
		int array[]= {100,2,-1,5,9,10,85,-100,55};
		//calling the function
		sort(array);
		System.out.println("sorted array elements: ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}

	static void sort(int arr[]) 
    	{ 
        	int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
}