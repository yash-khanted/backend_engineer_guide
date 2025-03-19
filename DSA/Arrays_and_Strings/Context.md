# Arrays and Strings
An array is ordered collection of similar type elements. A string is an array of characters.\
Arrays and strings in java are immutable. That is, their length property cannot be changed once assigned.

Assigning and implementting arrays in java
```
public void CreateArray(){
    //Declaring an empty array variable
    int[] arr1, arr2;

    //creating a array of length n elements.
    arr1 = new int[n];

    //creating an array with values
    arr2 = new int[](1, 2 ,3 , 4);
    //or
    arr2 = {1, 2 ,3 ,4};
}
```
## 1D Arrays
### prefix/suffix sum
When you keep adding the sum of all elements to the succesor element in an array, it creates an arrays where each element is sum of all its preceding elements. Similarly to the suffix array, where each element has the sum of the succeding element.
```
public int[] prefixSum(int[] arr){
    int[] pfarr = new int[arr.length];
    //assigning the first element in pfarr is must
    pfarr[0] = arr[0];

    for(int i = 1; i < arr.length; i++){
        pfarr[i] = pfarr[i-1] + arr[i];
    }
}

publix int[] SuffixSum(int[] arr){
    int[] sfarr = new int[arr.length];
    //assigning the last element is must
    sfarr[arr.length - 1] = arr[arr.length - 1];

    for(int i = arr.length - 2; i > -1; i--){
        sfarr[i] = sfarr[i+1] + arr[i];
    }
}
```
### contribution technique
This technique is useful when you have to find the sum of all sub-arrays. Here you recognize the contribution of each array element in creating all the sub-arrays. Contribution means count of occurence of each element in all sub arrays.

Let the array be [1, 2, 3, 4] then \
all the sub-arrays are \
[1], [1, 2], [1, 2, 3] [1, 2, 3, 4] \
[2], [2, 3], [2, 3, 4] \
[3], [3, 4] \
[4] 

Here, \
1 appears 4 times\
2 appears 6 times\
3 appears 6 times\
4 appears 4 times

index (i) : 0    1   2   3\
count(c) : 4    6   6   4

$$
contribution (c) = (n-i)*(i+1)
$$
Here, n is the length of the array.

## Kadane's algorithm
This algorithm is used to find the sub array with the largest sum (contingous subarray of maximum sum) in linear time.

Given an array, with range [-Z, +Z] we need to find the subarray which has the largest sum among all subarrays.
BruteForce:
```java
//The brute force method
//Iterate through all the sunarrays an find the maximum one
public int maxSum(int[] A){
    int maxSum = 0;

    for(int start=0; start<A.length; start++){
        for(int end=i; end<A.length; end++){
            for(int i=start; i<end; i++){
            }
        }
    }
}
```

## Two pointers technique
In this technique, we use two index pointers for navigating through the array.

## 2D Arrays
In a 2-dimensional array **matrix**,\
The number of rows = matrix.length\
The number of columns = matrix[index].length

2-Dimensional arrays are also called as array of arrays.\
Ex: A: [[1,3,4], [6, 8, 9], [4, 2, 1]]

```
//Declaring a two dimensional array
int[][] matrix;
matrix = new int[3][3];

int[][] unitMatrix = {{1,0,0}, 
                      {0,1,0}, 
                      {0,0,1}};
```

# Strings - Pattern Matching
## Kuth-Pratt-Morris Algorithm
### Background
**prefix strings:**: substrings starting from the beginning.

example string:
yash
 
y \
ya \
yas \
yash

**suffix strings**: substring ending at the length of the string. 

h \
sh \
ash \
yash

**LPS of string:** Length of the longest string which is both prefix and suffix string while excluding the whole string

For example,
let string be **ababaa**

prefix string excluding the whole string are
a\
ab\
aba\
abab\
ababa\
Suffix string excluding the whole string
a\
aa\
baa\
abaa\
babaa\

Here, we can only the prefix string **a** is both prefix and suffix string. So the LPS is one.

**pattern matching problem** \
Consider a string, **Pattern : aab**  and **Text : asasbbabbaab**. Find all the matching strings P in text string T.

**idea:**
1. make a new string p + "\$" + T
   1. The reason is beacause while creating LPS array we should be able to differentiate the pattern from the text.
2. Create an LPS array for thhe above string
   1. LPS array is an integer array, in which each index i is the LPS value for the substring(0, i).
3. The LPS values matching the length of the pattern will the starting point of the pattern in the text

```java
//Code for calculating the LPS array
public int[] getLPS(String text){
    //empty array
    int[] lps = new int[text.length()];
    lps[0] = 0;

    for(int i=1; i<text.length; i++){
        p = lps[i - 1];
        if(text.charAt(p) == text.charAt(i)){
            //As we lps[i] = lps[i - 1] + 1, At max
            lps[i] = p + 1;
        }
        else{
            while(p > 0){
                p = lps[p - 1];
                
                if(text.charAt(p) == text.charAt(i)){
                    lps[i] = p + 1;
                }     
            }
        }

        return lps;
    }
}
```

## Z - Algorithm
