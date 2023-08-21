class Solution {
	int[] getCumulativeSum (int[] arr) {
		// add your logic here
		int sum=0;
		
		for(int i=0; i< arr.length; i++){
			sum += arr[i];
			arr[i] = sum;
		}
		return arr;
	}
}
