public class problems {
    //find if in a number ith bit is set or unset
    public boolean CheckBit(int number, int bitPosition){
        //true is returned if bit it set

        /* Approach
                We use right shift operator to get the required bit
                at the 0th bit position and then perform (number & 1) to check
         */

         number = number>>bitPosition;
         if((number & 1) == 1) return true;
         else return false;
    }

    //in an array, every element repeats twice except one. find it
    public int uniqueElement01(int[] arr){

        /*Approach
         *  Here, performing bitwise xor operation on all the elements will
         * remove the duplicates as a^a = 0 and we will be remained only with
         * unique element
         */

        int uniqueNumber = 0;
         for(int i=0; i<arr.length; i++){
            uniqueNumber ^= arr[i];
         }

         return uniqueNumber;
    }

    //in an array, every element repeats thrice except one unique element
    public int uniqueElement02(int arr[]){
        
        /*Approach
         * idea
         * since ducplicate elements appear thrice, sum of set bit count at any position
         * would be in term of 3 multiples + 1, the one remaining will denote the unique element
         * 
         *  Here, we have to count the number of set bits at each ith position and perform
         *  count % 3. As, for dupliactes which repeat thrice will similar bit set and
         * unset at every bit position. But for the unique element where ever we have
         * the set bit, there count will be 1 + multiple of 3.
         */

        int uniqueNumber = 0;

        //as integer type has 32 bits, so iteration over all bits
        for(int i=0; i<32; i++){
            int count = 0;
            //to iterate over the array
            for(int index = 0; index<arr.length; index++){
                if(CheckBit(arr[index], i)) count++;
            }

            if(count % 3 == 1){
                uniqueNumber += (1<<i); //as 1<<i = 2^i
            }
        }

        return uniqueNumber;
    }
    
    //in a array, every element comes thrice, except one which come twice
    public int uniqueElement03(int[] arr){
        
        /*Approach
         * Just as the uniqueelement02 version but the count of set bits will
         *  count = 2 + multiple of 3.
         */

         int uniqueNumber = 0;

         //as integer type has 32 bits, so iteration over all bits
         for(int i=0; i<32; i++){
             int count = 0;
             //to iterate over the array
             for(int index = 0; index<arr.length; index++){
                 if(CheckBit(arr[index], i)) count++;
             }
 
             if(count % 3 == 2){
                 uniqueNumber += (1<<i); //as 1<<i = 2^i
             }
         }
 
         return uniqueNumber;
    }

    //in an array, every element repeats twice except two unique elements. Find them
    public int[] TwoUniqueElements(int[] arr){

        /*Approach
         * Observation
         * here, divide and conquer strategy will work, as the unique's has unsimilar type of
         * bits and all the remaining dupliacate will follow only one element based on the similarity
         * 
         * idea
         * We first find the xor of all elements, then we find the set bit
         * in the resultant number
         * As in xor, we know 1 ^ 0 = 1. So, now we can separate all the array elements
         * into two categories based the context if the bit set or not set at the particular
         * postion.
         * As identical elements have same bit at every postion, they will cancel out and have
         * no effect in the end product. Each category will remain with one unique element.
         */
        int[] uniqueNumbers = new int[2];
        
        int xorsum = 0;
        for(int i=0; i<arr.length; i++){
            xorsum ^= arr[i];
        }

        //check the set bit postition
        int setBit = -1;
        for(int i=0; i<32; i++){
            if(CheckBit(xorsum, i)) setBit = i;
        }

        //two seperate array element into two categories
        for(int iterate=0; iterate<arr.length; iterate++){
            if(CheckBit(arr[iterate], setBit)) uniqueNumbers[0] ^= arr[iterate];
            else uniqueNumbers[1] ^= arr[iterate];
        }

        return uniqueNumbers;
    }

    //for a given array, find the sum of all the xor pairs
    public int XorPairsSum(int[] arr){

        /*Approach
         * Let suppose there is an array {3, 2, 5}, then all the xor pairs are
         * 3^3 3^2 3^5
         * 2^3 2^2 2^5
         * 5^3 5^2 5^5
         * 
         * Observations
         *  we can say that all the diagonal elements are 0
         *  and if we see this is a symmetric matrix. So upper triangle is equal to lower triangle
         *  as bitwise xor is commutative 3^5 = 5^3
         * 
         * in bitwise xor operation, a bit is set only if the count of set bit in operand is odd
         * So for every pair, if at every bit position there is odd count of set bit then it will contribute in
         * the final sum
         * 
         * idea
         * So, categorise all the array elements in to set and unset bit categories at every bit position
         * then find the number of pair that will contribute
         *          count of elements in set catefory * count of elements in unset category
         */
        
        int sum = 0;

        //iterate over each bit poistion of integer type
        for(int bitPosition = 0; bitPosition<31; bitPosition++){
            int setbitCount = 0;

            for(int index = 0; index< arr.length; index++){
                if(CheckBit(arr[index], bitPosition)) setbitCount++;
            }

            int unSetBitCount = arr.length - setbitCount;
            sum += (1 << bitPosition) * (setbitCount * unSetBitCount);
        } //one bit left as it sign value

        return 2*sum;
    }

    //for a given array, find the maximum(arr[i] & arr[j]), where i != j
    public int MaxPair(int[] arr){
        
        /*Approach
         * Let for example array {3, 5, 6}
         * 3&3 3&5 3&6
         * 5&3 5&5 5&6
         * 6&3 6&5 6&6
         * 
         * observations
         * So the answer is the maximum of all the above pairs
         * MSB - most significant bit. When there are two bit at each position the MSB
         * is the one which is farthest from the oth bit
         * The pair with maximum count of MSB will be the maximum value
         * 
         * idea
         * So if we can compare the MSB for each pair, then with every iteration
         * we can keep removing the lower value pairs.
         */

        int maxNum = 0;
        //starting from left to right
        for(int bitPosition=30; bitPosition>=0; bitPosition--){
            int setBitCount = 0;

            //calculating the count of set bits
            for(int index = 0; index<arr.length; index++){
                if(CheckBit(arr[index], bitPosition)) setBitCount++;
            }

            //if the count is greater than two, only then we can have a pair which can contribute in the result
            /*if the count is less than one then, we are sure that there will be no pair that can set the 
            * the bit at that bit position in the answer
            */
            if(setBitCount >= 2){
                for(int index = 0; index<arr.length; index++){
                    //whereever the bit is unset, we eliminate the number by changing it to zero
                    //Because of MSB if we include those number, they will have no effect in max number
                    if(!CheckBit(arr[index], bitPosition)) arr[index] = 0;
                }

                maxNum += (1 << setBitCount);
            }
        }

        return maxNum;
    }

    //for a given array, find the maximum(arr[i] & arr[j] & arr[k] & arr[l]) where i != j != k != l
    public int MaxPair01(int[] arr){

        /*
         * Approach
         * similar to the above problem only change would be to change the setBitCount condition
         * to 4 [as many number in the operation].
         * Because, for any bit to be set with & operation, there should be as many number of
         * set bits in the logical statement
         */

        int maxNum = 0;
        
        for(int pos=30; pos>=0; pos--){
            int count = 0;
            for(int index=0; index<arr.length; index++) count++;

            if(count >= 4){
                for(int index = 0; index < arr.length; index++){
                    if(CheckBit(arr[index], pos)) arr[index] = 0;
                }

                maxNum += (1 << count);
            }
        }

        return maxNum;
    }

    //for a given array, find the count maximum pairs for which bitwise and operation will give maximum value
}
