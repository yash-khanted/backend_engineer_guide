public class problems{

    //function to merge two sorted arrays
    public int[] Merger(int[] A, int[]B){

        //creating the resultant array with combined length of A and B
        int[] result = new int[A.length + B.length];

        //trigger a loop to run till one of the sorted array index is exhausted
        int index = 0;
        int Aindex = 0;
        int Bindex = 0; //variable to track array indexes
        while(index < A.length && index < B.length){
            //the lowest number is added first
            //creating an increasing array
            if(A[Aindex] < B[Bindex]){
                result[index] = A[Aindex];
                Aindex++;
            }
            else{
                result[index] = B[Bindex];
                Bindex++;
            }

            index++;
        }

        //created this loop to fill the remaining A values if present
        while(index < A.length){
            result[index] = A[Aindex];
            Aindex++;
            index++;
        }

        //created to fill the remaining B values if present
        while(index < B.length){
            result[index] = B[Bindex];
            Bindex++;
            index++;
        }

        return result;
    }

    public static int[] MergeSort(int[] arr){
        int length = arr.length;

        //termination condition
        if(length == 1){
            return arr;
        }

        int[] arrOne = new int[length/2];
        int[] arrTwo = new int[length - length/2];

        int arrIndex = 0;
        for(int i=0; i<arrOne.length; i++){
            arrOne[i] = arr[arrIndex];
            arrIndex++;
        }

        for(int i=0; i<arrTwo.length; i++){
            arrTwo[i] = arr[arrIndex];
            arrIndex++;
        }

        int[] firstHalf = MergeSort(arrOne);
        int[] secondHalf = MergeSort(arrTwo);
        //creating an problems object to call Merger method
        problems code = new problems();

        return code.Merger(firstHalf, secondHalf);
    }

    //1. Binary search for finding an element in the array of length N;
    public static int BinarySearch(int[] arr, int focus){
        
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        int middleIndex;

        while(lowIndex <= highIndex){
            //calculate middle index
            middleIndex = ((lowIndex + highIndex) / 2);

            //condition for halving the search space
            if(arr[middleIndex] == focus){
                return middleIndex;
            }
            else if(arr[middleIndex] < focus){
                lowIndex = middleIndex + 1;
            }
            else{
                highIndex = middleIndex - 1;
            }
        }

        //if there is no such element equal to focus then return -1;
        return -1;
    }


    //for an array, find the floor and ceil element of an element: focus
    public static int FloorSe(){
        return 0;
    }

            
             
    //for an array, find the first and last occurences of an element

    //for a given 2d matrix, it's rows are sorted from left to right and the first column element of every row is greater than the
    //last column element of the previous row. For this type array find an element.

    //for a given sorted array, the array is rotated clockwise for some index value. Find the element

    //In an array, there are two occurences of each element except on eunique elment find it

    
/*
 * INSERTION SORT
 * 
 * psuedocode:
 * initialize array ans
 *  
 * for j <- 2..A[length]
 *      do
 *          key <- A[j]
 *          i <- j-1
 *          while i > 0 && A[i] > key
 *              A[i + 1] = A[i]
 *              A[i] = key
 *              i <- i-1
 *          
 */

    public int[] insertionSort(int[] arr){
        //we start from left side to iterate through each element
        for(int index = 1; index < arr.length; index++){
            //key is the element to be inserted in the stack.
            int key = arr[index];
            //the key is check with all the elements left to it
            int position = index - 1;

            // with this loop condition if any element left to the key is larger then it get swapped.
            while(position > -1 && arr[position] > key){
                //swapping done below
                arr[position + 1] = arr[position];
                arr[position] = key;
                //postion moving from key index to -1
                position--;
            }
        }
        //return ascending arrray
        return arr;
    }

    public int[] insertionSortDesc(int[] arr){
        for(int index = arr.length - 2; index >= 0; index--){
            int key = arr[index];
            int position = index + 1;

            while(position < arr.length && arr[position] > key){
                arr[position - 1] = arr[position];
                arr[position] = key;
                position++;
            }

        }

        return arr;
    }
/*
 * Llinear search
 * for index <- arr[0..arr.length]
 *      if(v == A[index]) return index;
 */

    public static void main(String[] args) {
        int[] arr = new int[]{22, 3432, 8, 53, 752, 38, 4, 718, 471, 823, 76, 63, 57, 3495, 8435, 893, 47, 5};
        int[] sortedArr = new int[arr.length];

        /*Insertion Sort */
        problems prob = new problems();

        for(int i=0; i<arr.length; i++){ System.out.print(arr[i] + " "); }
        System.out.println("\n\nInsertion Sort");

        sortedArr = prob.insertionSort(arr);
        for(int i=0; i<arr.length; i++){ System.out.print(sortedArr[i] + " "); }

        System.out.println("\n\nInserstion sort Descending");
        int[] sortedArrDesc = new int[arr.length];
        sortedArrDesc = prob.insertionSortDesc(arr);
        for(int i=0; i<arr.length; i++){ System.out.print(sortedArrDesc[i] + " "); };
    }
}

