class Solution {
	void insertionSort (int[] arr) {
		// add your logic here
		for(int i=0; i < arr.length; i++ ){
			for(int j=0; j < i; j++){
				if(arr[i] < arr[j]){
					int t= arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
	}
}
