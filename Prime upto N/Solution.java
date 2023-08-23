class Solution {
   boolean isPrime(int n) {
       for(int i = 2; i * i <= n; i++) {
           if(n % i == 0) {
               return false;
           }
       }
       return true;
   }
   List<Integer> primesUptoN(int n) {
       ArrayList<Integer> answer = new ArrayList<Integer>();
       for(int i = 2; i <= n; i++) {
           if(isPrime(i) == true) {
               answer.add(i);
           }
       }
       return answer;
   }
}
