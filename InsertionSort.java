public class InsertionSort {	
	
	public static int[] insertionSort(int[] incArray){
		for(int j=1; j<incArray.length; j++){
			int key = incArray[j]; 
			for(int i=j-1; i>=0; i--){
				if(incArray[i]>key){
					int temp = incArray[i];
					incArray[i] = key;
					incArray[i+1] = temp;					
				}
			}
		}
		return incArray;
	}
	
	public static int[] displayArray(int[] incArray){
		for(int i=0; i<incArray.length; i++){
			System.out.print(incArray[i] + " ");
		}
		System.out.println("\n");
		return incArray;
	}
	
	
	public static void main(String[] args) {
		int[] array = {23,65,21,78,87,34,71,90,5,8};
		insertionSort(array);
		displayArray(array);
		
		
	}

}
