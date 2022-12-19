# Arrays
1. I/o operations
2. special index
```
public class Solution {
    public int solve(int[] A) {
        int length = A.length;

        int[] pse = new int[length];
        int[] pso = new int[length];

        pse[0] = A[0];
        pso[0] = 0;

        for(int i=1; i<length; i++){
            if(i%2==0){
                pse[i] = pse[i-1] + A[i];
            }
            else{
                pse[i] = pse[i-1];
            }
        }

        for(int i=1; i<length; i++){
            if(i%2!=0){
                pso[i] = pso[i-1] + A[i];
            }
            else{
                pso[i] = pso[i-1];
            }
        }

        int count = 0;

        for(int i=0; i<length; i++){
            int se = 0;
            int so = 0;

            if(i!=0){
                se = pse[i-1] + pso[length-1] - pso[i];
                so = pso[i-1] + pse[length-1] - pse[i]; 
            }
            else{
                se = pse[length-1];
                so = pso[length-1];
            }

            if(se == so) count++;
        }

        return count;
    }
}

```
4. MaxSum subarray
5. Beggar's problem
6. Rain water trapping problem
7. Continuous sum query