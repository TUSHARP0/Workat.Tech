class Solution {
	int getIdenticalTwinsCount (int[] arr) {
		// add your logic here
		int counter=0;
		for(int j=0; j < arr.length; j++){
			for(int i=j+1; i < arr.length; i++){
			if(arr[i] == arr[j]){
				counter++;
			}
		}
		}
		return counter;
	}
}
