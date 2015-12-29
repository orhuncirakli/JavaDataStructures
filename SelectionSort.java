public class SelectionSort {
	public static int[] selectionSort(int[] array){
		int temp = 0;
		for(int i=0; i < array.length-1; i++){
			int min = i;
			for(int j=i+1; j<array.length; j++){
				if(array[j] < array[min]){
					min = j;
				}
			}
			
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		return array;
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
		selectionSort(array);
		displayArray(array);

	}

}
