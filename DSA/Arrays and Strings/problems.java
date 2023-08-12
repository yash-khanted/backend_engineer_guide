public class problems {
    // 1. Special index - an index in which sum of odd indexed elements is equal to
    // sum of even indexed elements
    public int SpecialIndex(int[] A) {

        /*
         * Approach
         * Observation
         * after creating the new array by deleting the ith element
         * 1. for all elements that are left to ith element, there is no change in the
         * index position
         * 2. for all elements that are right to the ith element, the previously even
         * index elements
         * are all in odd index position.
         * 
         * idea
         * iterate over all the elements in the arrray, and using some formulaes find
         * the prefix sum and
         * calculate special index count
         */
        int length = A.length;

        int[] pse = new int[length];
        int[] pso = new int[length];

        pse[0] = A[0];
        pso[0] = 0;

        /*
         * Here, creating prefix sum arrays is key point
         * take example array,
         * 2 4 5 1 -2 3 4 5
         * Then, prefix sum even(pse) will be,
         * 2 2 7 7 5 5 9 9
         * Then, prefix sum odd(pso) wil be,
         * 0 4 4 5 5 8 8 13
         */
        for (int i = 1; i < length; i++) {
            if (i % 2 == 0) {
                pse[i] = pse[i - 1] + A[i];
            } else {
                pse[i] = pse[i - 1];
            }
        }

        for (int i = 1; i < length; i++) {
            if (i % 2 != 0) {
                pso[i] = pso[i - 1] + A[i];
            } else {
                pso[i] = pso[i - 1];
            }
        }

        int count = 0;

        for (int i = 0; i < length; i++) {
            int se = 0;
            int so = 0;

            if (i != 0) {
                se = pse[i - 1] + pso[length - 1] - pso[i];
                so = pso[i - 1] + pse[length - 1] - pse[i];
            } else {
                se = pse[length - 1];
                so = pso[length - 1];
            }

            if (se == so)
                count++;
        }

        return count;
    }
////////////////////////////////////////////////////////////////
    // 2. MaxSum subarray sum
    /*
     * Question: find the sum of the maximum contiguous sub array
     * Idea: [Kadane's Algorithm] 
     * iterate over the array 
     */

////////////////////////////////////////////////////////////////
    // 3. Beggar's problem
    /*
     * Question: Out of A beggars has an empty pot sitting at temple, devotees donate P coins to K beggars sitting side by side
     *              given that we find out the total collection for each beggar
     * idea: let's say there are 5 beggars, with devotees donatings coins of equal value to some sitting side by side
     *      beggars:   0 0 0 0 0
     *      devotee 1:   1 1 
     *      devotee 2: 2 2 2
     *      devotee 3:       3 3
     *      =====================
     *      total:     2 3 3 3 3
     * this approach solves the problem in O(no.of devotees * no.of beggars) #worst case
     * But if we simply assign the starting beggar gettting the donation, then by creating the prefix sum array we can 
     * get the total collection for each beggar
     */
    public int[] beggarsCollection(int[][] devotee, int NBeggars){
        int[] collection = new int[NBeggars];

        for(int i=0; i<devotee.length; i++){
            int start = devotee[i][0];
            int end = devotee[i][1];
            int donation = devotee[i][2];

            //the first beggar is assigned with the donation that will be added to the other in prefix sum array
            collection[start-1] = donation;
            //to minus the effect of prefix sum after the end/last beggar we write -donation to the end + 1 beggar
            if(end < NBeggars){
                collection[end] = - donation;
            }

            //creating the prefix sum array
            for(int k=1; k<collection.length; k++){
                collection[k] += collection[k-1]; 
            }
        }
        return collection;

    }
////////////////////////////////////////////////////////////////
    // 4. Container with most water
    //https://leetcode.com/problems/container-with-most-water/
    /*
     * Objective: to find the boundaries of the container that could store the most water
     * [1, 8, 9, 2, 3, 9, 8, 0]
     * pfmax
     * [1, 8, 9, 9, 9, 9, 9, 9]
     * sfmax
     * [1, 9, 9, 9, 9, 9, 8, 0]
     * 
     * w=0
     * at 1 : w += 8 - 8 = 0
     * at 2 : w += 9 - 9 = 0
     * at 3 : w += 8 - 2 = 6
     * at 4 : w +=  
     * 
     * [1, 2, 3, 4, 3, 2, 1]
     * [1, 2, 3, 4, 4, 4, 4]
     * [4, 4, 4, 4, 3, 2, 1] 
     */

     public int mostWater(int[] height){
        int water = 0;

        int[] pfMaxArray = height;
        int maxValue = pfMaxArray[0];
        for(int i = 1; i < pfMaxArray.length; i++){
             if(maxValue < pfMaxArray[i]){
                maxValue = pfMaxArray[i];
             }
             pfMaxArray[i] = maxValue;
        }

        int[] sfMaxArrray = height;
        maxValue = sfMaxArrray[sfMaxArrray.length - 1];
        for(int i=height.length-2; i>=0; i--){
            if(maxValue < sfMaxArrray[i]){
                maxValue = sfMaxArrray[i];
            }
            sfMaxArrray[i] = maxValue;
        }


        return water;
     }

////////////////////////////////////////////////////////////////
    // 5. Continuous sum query
////////////////////////////////////////////////////////////////
    // 6. Matrix Multiplication - Code to compute matrix multiplication as in actual
    // mathematics

    public int[][] MultiplyMatrix(int[][] A, int[][] B) {
        /*
         * Approach:
         * Given two matrices A and B of order m X n and n X p. Multiply and return the
         * m X p product matrix
         * 
         * Idea:
         * Initialize a zero matrix and iterate over each element of the matrix
         * In the first loop take every row from the A matrix
         * In the second loop, for every row create the product sum of row and column
         */
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;

        // intializing a zero array
        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++) {
            int[] row = A[i];

            for (int j = 0; j < p; j++) {
                int sum = 0;

                for (int k = 0; k < p; k++) {
                    sum += row[k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        return C;
    }
////////////////////////////////////////////////////////////////
    // 7. Rotating a matrix in place without using extra memory

    public void RotateMatrix(int[][] A) {
        /*Approach:
         * Let A = [1 2 3]
         *         [4 5 6]
         *         [7 8 9]
         * the rotaion of a matrix 90 degress in clockwise will rows into columns in reverse order 
         * 
         * 1. Transpose the matrix first, then
         *      A becomes [1 4 7]
         *                [2 5 8]
         *                [3 6 9]
         * 
         * 2. Now reverse the colums of the matrix to mate the roation
         * 
         * final result is [7 4 1]
         *                 [8 5 2]
         *                 [9 6 3] 
         * 
         */

        int n = A.length;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<i ; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n/2 ; j++){
                int temp = A[i][j];
                A[i][j] = A[i][n-j-1];
                A[i][n-j-1] = temp;
            }
        }
    }

////////////////////////////////////////////////////////////////
//Strings
////////////////////////////////////////////////////////////////
    public int PatternMatching(String A, String B) {
        String T = A + '$' + B;
        int checkLength = A.length();
        int count = 0;

        for(int i=checkLength+1; i<T.length(); i++){
            int lps = LPS(BuildString(T, 0, i));
            if(lps == checkLength) count++; 
        }

        return count;
    }

    public int LPS(String T){
        int N = T.length();
        int prefixEndIndex = N-1;
        int suffixStartIndex = 1;
        
        while(prefixEndIndex > -1 && suffixStartIndex < N){
            String prefixString = BuildString(T, 0, prefixEndIndex);
            String suffixString = BuildString(T, suffixStartIndex, N);

            if(prefixString.equals(suffixString)){
                return prefixEndIndex;
            }
            else{
                prefixEndIndex--;
                suffixStartIndex++;
            }
        }
        return 0;
    }

    public static String BuildString(String T, int start, int end){
        String ans = "";

        for(int i=start; i<end; i++){
            ans += T.charAt(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        problems box = new problems();

        System.out.println(box.PatternMatching("as", "yash"));
        //System.out.println(box.LPS("abba"));
    }
}
