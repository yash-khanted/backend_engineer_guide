package HashMap;

import java.util.HashMap;

public class problems {
//1. Distinct numbers in a window
/*Let us suppose there is an array [10, 2, 3, 2, 4, 5, 10, 4, 6] 
 *Window size is 3
 *Now the first window is [10, 2, 3] then here count of distinct numbers is 3
 *Next window is [2, 3, 2] here distinct number count is 2
 *next window is [3, 2, 4] here distinct number count is 3 and so on
 *thus make an array of all the counts of distinct numbers ans return the array
*/
    public int[] DistinctWindow(int[] A, int B) {
        //the size of resulting array will be N-B+1
        //N - array size, B - window size
        int[] ans = new int[A.length-B+1];
        //creating a hashmap to store
        HashMap<Integer, Integer> map = new HashMap<>();


        return ans;
    }
}

1 - 100
2 - 50
3 - 
4 -
5 - 
6 -
7 -
8 -
9 -
10 -
