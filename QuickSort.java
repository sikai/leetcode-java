class Untitled {
	public void qsort(int[] arr){
		qsort(arr,0,arr.length-1);
	}
	public void qsort(int[] arr, int start, int end){
		int mid = start + (end-start)/2;
		int pivot = arr[mid];
		int i = start;
		int j = end;
		while(i<=j){
			while(arr[i]<pivot){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<=j){
				swap(i,j);
				i++;
				j--;
			}
		}
		if(j>start){
			qsort(start,j);
		}
		if(i<end){
			qsort(i,end);
		}
	}
	public static void main(String[] args) {
		
	}
}
public void qsort(int[] arr){
	aqsort(arr,0,arr.length-1);
}
public void qsort(int[] arr, int start, int end){
	if(start>end) return;
	int mid = start + (end-start)/2;
	int pivot = arr[mid];
	int i=start;
	int j=end;
	while(i<=j){
		while(arr[i]<pivot){
			i++;
		}
		while(arr[j]>pivot){
			j--;
		}
		if(i<=j){
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	if(j>start) qsort(arr,start,j);
	if(i<end) qsort(arr,i,end)
}