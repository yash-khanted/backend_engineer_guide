# Data structures
It is the method or format of storing and organising data, such that it can be retrieved and used efficiently.

There are two categories of data structures
1. Linear DS
   1. arrays and strings
   2. linked lists
   3. stacks
   4. Queues
2. Non linear DS
   1. Trees
   2. Graphs
   3. Tables
   4. Sets

- In any computer problem DS and algo go hand in hand. To say, DS has implementation of algorithm and algorithm demands appropriate DS
- A well designed data structure allows
  - a variety of critical operations to be performed
  - Monitors both execution time and memory usage

## Datatypes

There are two types 
1. Primitive datatype
   1. int, long, float etc
2. Non-primitive datatype
   1. All data structures are part this type - arrays, linkedlist, graph, trees etc

### Abstract Datatypes (Non primitive types)
These are complex data structures that are used to store large amounts of connected data.

#### Arrrays
#### Lnked lists
#### Stacks
#### Queues
#### Trees

# High Level Overview of Data structure of algorithms
An algorithm is a finite set of instructions that, if followed, accomplishes a particular task. In addition, all algorithms must satisfy the following criteria
1. **Input:** Zero or more quantities are externally supplied
2. **Output:** At least one quantity is produced
3. **Definiteness:** Each instruction is clear and unambiguous
4. **Finiteness:** If we trace out the instructions of an algorithm, then for all cases, the algorithm terminates after a finite number of steps
5. **Effectiveness:** Every instruction must be very basic so that it can be carried out, in principle, by a person using only pencil and paper. It is not enough that each operation be definite as in criterion 3: It also must be feasible.
---
### Study of algorithms
There are four branches or divsion for studying algorithms
1. How to devise the algorithm
   1. "Algorithm making is an art and it may never be fully automated"
   2. It useful to learn about some methods/ techniques used in algorithm design
2. How to validate the algorithm
   1. A two phase process
      1. Program validation
      2. Program verification/ proof of correctness
3. How to analyze the algorithm
   1. It is also called as performance analysis
4. How to test the algorithm
   1. Debugging
   2. Performance measurement

### Algorithm Specification
Algorithms can be expressed in plain english by using some general conventions for better readability.
The following examples show the convention ued for making algorithms

**Alogirthm specification for selection Sort**
```
SelectionSort(int[] arr)
{
    for i = 1 to n do
    {
        int index = i;
        for j = i to n do
        {
            if arr[i] > arr[j]
                index = j;
        }

        int t = arr[i];
        arr[i] = arr[index]
        arr[index] = t;
    }
}
```

### Recursive Algorithms
1. Towers of hanoi
2. Permutation generator

# Algorithms
FOur types
1. Complete search / Brute force
    Iterative, Recursive or back tracking
2. Divide and conquer
    merge sort, binary search
3. Greedy algorithm
4. Dynamic programming

Optimazation problems
The problems where maximum or maximum is to be found.
1. Greedy method
2. Dynamic programming
3. Branch and bound
## Time Complexity
Time complexity is the time taken by an algorithm/program to run as a function of the length of the input
- Time complexity helps in comparing efficiency between two algorithms
- This analysis is independent of the machine's parameters and only on the length of input.

### Asymptotic notation
Asymptotic notations are mathematical notations which are used to describe the running time of an algorithm when input tends towards infinity.

1. **Big-O notation**: The Big-O notation describes the worst-case running time of an algorithm. It is computed by counting the number of operations it will take in the worst-case scenario with the input ‘n’.
$$
O(g(n)) = { f(n): there exist positive constants c and n0
           such that 0 ≤ f(n) ≤ cg(n) for all n ≥ n0 }
$$
2. **Big Omega() notation**: The notation describes the best running time of an algorithm. It is computed by counting the number of operations it will take in the best-case scenario with the input ‘n’.
$$
Ω(g(n)) = { f(n): there exist positive constants c and n0 
           such that 0 ≤ cg(n) ≤ f(n) for all n ≥ n0 }
$$
3. **Big Theta() Notation**: The theta notation encloses the function from above and below, therefore it defines the exact asymptotic behaviour. The notation is used for analyzing the average runtime of an algorithm.
$$
Θ(g(n)) = { f(n): there exist positive constants c1, c2 and n0
           such that 0 ≤ c1g(n) ≤ f(n) ≤ c2g(n) for all n ≥ n0 }
$$

Big-O notation helps
- Desribe the limiting behavior of the function
- characterises a function based on growth of function
- Upper bound on growth rate of the function

n being the number of test cases
- O(1)	Constant Time Complexity\
Example: Sum of two numbers.
- O(logn)	Logarithmic Time Complexity\
Example: Finding an element in a sorted - array by using binary search.
- O(n)	Linear Time Complexity\
Example: Finding the sum of an array of size n.
- O(n logn)	Log-Linear Time Complexity\
Example: Sorting the array using merge sort.
- O(n2)	Quadratic Time Complexity\
Example: Finding the sum of every pair of elements in an array.
- O(2^n) Exponential Time Complexity\
Example: Finding all the subsets.
- O(n!)	Factorial Time Complexity\
Example: Finding all the permutations of a given array.

We generally use big-O notation because it provides a way to understand the algorithm for very large size input and at the worst case scenario.

Examples\
1. 
```
int count = 0;
for (int i = N; i > 0; i /= 2) {
    for (int j = 0; j < i; j++) {
        count += 1;
    }
}
//If you think TC is O(N*N) or O(N logN) then you are wrong
//time Complexity is O(N)
```
#### explanation
consider the inner loop\
for i = N, j run from 1 to N;\
for i = N/2, j run from 1 to N/2 thus total number iterations are
$$ N + N/2 + N/3 + ..... + 1 = N(1 + 1/2 + 1/3 + ..... + 1/N) $$
$$ N + N/2 + N/3 + ..... + 1 = 2*N ---- O(N) $$ 
the sum of 1/N series.

----------

2.
```
int i, j, k = 0;
for (i = n/2; i <= n; i++) {
    for (j = 2; j <= n; j = j * 2) {
         k = k + n/2;
    }
}
//time comlexity is O(N LogN)
```
 #### explanation
 from first loop, i starts from N/2 to N at a step 0f 1
 the second loop, start from i to N exponentially
 $$ i -> i*2 -> i*2*2 -> i*2*2*2 - ....... $$
 This continues till i is less than N, thus LogN definition states the number of time a number can be divided by the specified base number till it becomes near to zero. [**alternate definition** :- Number of times, you can double a number till it is less than n would be log(n)].\
 The sum of operations are
 $$ logN + logN + logN + ........ i-times [N/2, N] $$
 $$ N/2 * logN = O(N*logN) $$

----------

3. 
consider the below code
```
if(int i = n; i > -1; i/=2){
    <statements>;
}

//the loop runs for infinite times
```

#### explanation
Here the terminating condition is that i to be greater than -1. The iteration is i getiing deivided by two. Thus when i get to zero the condition i>-1 will keep satisfying after that as 0/2 = 0.

-------