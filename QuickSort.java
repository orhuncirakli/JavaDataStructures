	public static void quickSort(int[] array, int left, int right){
		int l = left;
		int r = right;
		int temp = 0;
		int pivot = array[(left + right) / 2];
		while(i<=j){
			while(array[i]<pivot){
				i++;
			}
			while(array[j]>pivot){
				j--;
			}
			if(i<=j){
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}			
		}
		if(left < j){
			quickSort(array, left, j);
		}
		if(right > i){
			quickSort(array, i, right);
		}
	}
