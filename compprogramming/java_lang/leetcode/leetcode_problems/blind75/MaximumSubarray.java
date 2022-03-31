package java_lang.leetcode_problems.blind75;

public class MaximumSubarray {
    public static void main(String[] args) {
    int[] A = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(A));
    }
    //Kadane algorithm - classic DP problem
    //https://leetcode.com/problems/maximum-subarray/discuss/20211/Accepted-O(n)-solution-in-java
    //    https://youtu.be/2MmGzdiKR9Y
    public static int maxSubArray(int[] A) {
        int maxSoFar=A[0], maxEndingHere=A[0];
        for (int i=1;i<A.length;++i){
            maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
