class Solution {
	List<Integer> getEvenDigitNumbers (int[] arr) {
		// add your logic here\
		List<Integer> result= new ArrayList<>();
		int count=0;
		for(int i=0; i < arr.length; i++ ){
			String str = Integer.toString(arr[i]);
				if(str.length() % 2 == 0){
					count++;
					result.add(arr[i]);
				}
		}
		return result;
	}
}
