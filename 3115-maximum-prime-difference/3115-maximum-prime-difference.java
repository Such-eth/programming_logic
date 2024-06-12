class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            // System.out.println(i+" "+j);
            if(!isPrime(nums[i])) i++;
            else if(!isPrime(nums[j])) j--;
            else return j-i;
        }
        return 0;
    }
    public boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
  
        if (n == 2 || n == 3) 
            return true; 
  
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
        for (int i = 5; i <= Math.sqrt(n); i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
    } 
}