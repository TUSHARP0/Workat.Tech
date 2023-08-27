class Solution {
	void merge (int[] arr, int endIndex) {
		// add your logic here
		int[] tempArr = new int[arr.length];
		int leftptr = 0;
		int rightptr = endIndex + 1;
		int tempptr = 0;
		
		while((leftptr <= endIndex)&&(rightptr < arr.length)){
			if(arr[leftptr] <= arr[rightptr]){
				tempArr[tempptr++] = arr[leftptr++];
			}else{
				tempArr[tempptr++] = arr[rightptr++];
			}
		}
		
		while(leftptr <= endIndex){
			tempArr[tempptr++] = arr[leftptr++];
		}
		
		for(int i=0; i<tempptr; i++){
			arr[i]=tempArr[i];
		}
	}
}
