class Solution {
	int getMaxConsecutiveOnes(int[] A) {
	    // add your logic here
		int currentcons=0;
		int maxcons=0;
		for(int n:A){
			if(n == 1){
				currentcons++;
				maxcons=Math.max(maxcons,currentcons);
			}else{
				currentcons=0;
			}
		}
		return maxcons;
	}
}
