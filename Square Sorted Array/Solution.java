class Solution {
	int[] getSquareSortedArray (int[] arr) {
		// add your logic here
		int[] result = new int[arr.length];
		
		for(int i=0; i < arr.length; i++){
			result[i]=arr[i]*arr[i];
		}
		Arrays.sort(result);
		return result;
	}
}
