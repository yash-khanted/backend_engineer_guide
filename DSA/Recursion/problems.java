package Recursion;

public class problems {
    //Towers of Hanoi
    /*Statement:
     * Given n disks and three towers, the objective is to print the steps for shifting
     * n disks from tower 1 to tower 3 while satisfying 
     * - at any time there should not to a larger disk on smaller disk
     * - at a time only one disk can be shifted
     */

     /*Idea:
      * 
      */
    
}

public class Solution {
    public int countPainters(int[] C,long mid){
        int workers=0; long sum=0;
        for(int i=0;i<C.length;i++){
            sum+=C[i];
            if(sum>mid){
                workers++;
                sum=C[i];
            }
        }
        return workers+1;
    }
    public int paint(int A, int B, int[] C) {
        long sum=0;
        long max=-1;
        for(int i=0;i<C.length;i++){
            sum+=C[i];
            max=Math.max(max,C[i]);
        }
        long low=max,high=sum;
        long ans=-1;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(countPainters(C,mid)<=A){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return (int)((ans*B)%10000003);        
    }
}

