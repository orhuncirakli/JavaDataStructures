public class BubbleSort {
	
	public static int[] bubbleSort(int[] array){
		int j = 0;
		boolean swapped = true;
		
		while(swapped){
			swapped = false; 
			for(int i = 0; i < array.length - j; i++){
				if(array[i] > array[i+1]){
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;					
					swapped = true;
				}
			}
		
		}
		
				return array;	
	}
	
	public static void displayArray(int[] incArray){
		for(int i=0; i<incArray.length; i++){ 
			System.out.print(incArray[i] + " ");
		}
		System.out.println("\n");
		//return incArray;
	}
	
	public static void main(String[] args) {
		int[] array = {23,65,21,78,87,34,71,90,5,8};
		bubbleSort(array);
		displayArray(array);
	}

}
