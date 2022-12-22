public class problems {
    //1. Special index - an index in which sum of odd indexed elements is equal to sum of even indexed elements
    public int SpecialIndex(int[] A) {
        int length = A.length;

        int[] pse = new int[length];
        int[] pso = new int[length];

        pse[0] = A[0];
        pso[0] = 0;

        /*
        Here, creating prefix sum arrays is key point
        take example array,
                    2 4 5 1 -2 3 4 5
        Then, prefix sum even(pse) will be,
                    2 2 7 7 5 5 9 9
        Then, prefix sum odd(pso) wil be,
                    0 4 4 5 5 8 8 13
        */
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
//2. MaxSum subarray
//3. Beggar's problem
//4. Rain water trapping problem
//5. Continuous sum query