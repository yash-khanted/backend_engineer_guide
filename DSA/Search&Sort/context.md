# Sorting
The process of organising data in fashion

## Merge Sort
Here, sorting is done by merging two sorted arrays in recursive manner.
Solution approach\
First, you have to create a program to merge two sorted arrays.
Second, Write a recursive code to divide a single array into two arrays. Till you can one single element that can returned as it is

# Searching

## Binary Search
Binary search is a searching algorithm used on a sorted arrray by repeatedly dividing the search interval in half

In this algorithm, an ordered search space must be used. The mechanism is to halve the search space with every iteration based on some condition. Three important things for applying binary search algorithm are
- target - the element that we need to search
- search space - the range (tough part usually)
- condition - the decision point which helps in halving the search space

```java
// Example java code
function boolean binarySearch(int target, int[] array){
    // figure out the search space
    int low = 0;
    int high = array.length;

    while(low <= high){
        int mid = (low + high) / 2;
        
        // For avoiding overflow issues use long varaible or assign like
        mid = low + (high - low) / 2;

        if(array[mid] == target){
            return true;
        }
        else if(array[mid] < target){
            //eliminate the left half considering search space is sorted in non decreasing order
            low = mid + 1;
        }
        else{
            //eliminate the right half
            high = mid - 1;
        }

        return false;
    }
}
```

The above code uses time complexity of O(log n) with base 2