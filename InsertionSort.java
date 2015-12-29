public class InsertionSort {	
	
	public static int[] insertionSort(int[] array){
		for(int i=1; i<array.length; i++){
			int key = array[i]; 
			int j = i - 1;
			
			while(j>=0 && array[j]>key){
				array[j+1] = array[j];
				j--;
			}
			
			array[j+1] = key;
		}
		return array;
	}
	
	public static int[] displayArray(int[] array){
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
		return array;
	}
	
	
	public static void main(String[] args) {
		int[] array = {23,65,21,78,87,34,71,90,5,8};
		insertionSort(array);
		displayArray(array);
		
		
	}

}
