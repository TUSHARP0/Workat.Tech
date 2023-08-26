class Solution {
	int[] mergeSortedArrays(int[] A, int[] B) {
	    // add your logic here
		int[] C = new int[A.length + B.length];
		int indexA=0;
		int indexB=0;
		int indexC=0;
		while(indexA < A.length && indexB < B.length){
			if(A[indexA] <= B[indexB]){
				C[indexC++] = A[indexA++];
			}else{
				C[indexC++] = B[indexB++];
			}
		}
		while(indexA < A.length){
			C[indexC++] = A[indexA++];
		}
		
		while(indexB < B.length){
			C[indexC++] = B[indexB++];
		}
	
		return C;
	}
}
