class Solution {
	List<Integer> getPositiveCumulativeSum (int[] arr) {
		// add your logic here
		int[] cumulative= new int[arr.length];
		List<Integer> cummList= new ArrayList<>();
		int sum=0;
		
		for(int i=0; i < arr.length; i++){
				sum += arr[i];
				cumulative[i]=sum;
		}
		
		for(int j=0; j< cumulative.length; j++){
			if(cumulative[j] > 0){
				cummList.add(cumulative[j]);
			}
		}
			return cummList;
		}
		
	}
