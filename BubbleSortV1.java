public class BubbleSortDeneme {
	
	public static int[] bubbleSort(int[] array){
		int temp = 0;
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array.length-1; j++){
				if(array[j]>array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
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
		bubbleSort(array);
		displayArray(array);

	}

}
