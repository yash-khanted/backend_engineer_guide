package Discrete_Mathematics;

public class problems {
    //for give n +ve elements array, find all the pairs where [(arr[i] + arr[j]) % M] == 0, where i!=j
    public int pairCount(int[] arr){

        /*Approach
         * 
         */
    }

    //given n distinct elements array, with numbers from 0 to N-1. Replace evert arr[i] = arr[arr[i]]
    
    //Given n, find the sum of all number between 1 and n, which are divisible by 3 or 5 or 7
    //from leetcode https://leetcode.com/problems/sum-multiples
    public int sumOf3_5_7_multiples(int n){
        int sum = 0;
        //using set overlapping principle

        return sum;
    }

//////////////////////////////////////////////////////////////////////////////
/*
 * 3. Given two numbers A and B, find the maximum positive value of M such that
 * A%M = B%M
 */
    public int ABModulo(int A, int B){
        if( A >= B ) return A - B;
        return B - A;
    }

//////////////////////////////////////////////////////////////////////////////
/*
 * 4. Modulus of very large power of a number
 * find the value of power(A, B) % C. A ranges from -infinity to +infinity
 */

    public int power(int A, int B, int C){
        //power(0,0) case
        if( A == 0 && B == 0 ) return 0;
        if( B == 0 ) return 1;

        long halfVal = power(A, B/2, C) % C;
        long ans = (halfVal * halfVal) % C;

        if( B % 2 == 0 ){
            return (int) ans;
        }
        else{
            ans = (ans * A % C) % C;

            if(ans < 0) ans = ans + C;
            
            return (int) ans;
        }
    }
}
