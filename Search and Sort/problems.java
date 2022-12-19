public class problems{

    //function to merge two sorted arrays
    public int[] merger(int[] A, int[]B){

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
}
