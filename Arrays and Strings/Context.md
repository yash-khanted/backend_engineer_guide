# Arrays and Strings
An array is ordered collection of similar type elements. A string is an array of characters.\
Arrays and strings in java are immutable. That is, their length property cannot be changed once assigned.
## 1D Arrays
### prefix/suffix sum
When you keep adding the sum of all elements to the succesor element in an array, it creates an arrays where each element sum of all its preceding elements. Similarly to the suffix array, where each element has the sum of the succeding element.
### contribution technique
This technique is useful when you have to find the sum of all sub-arrays. Here you recognize the contribution of each array element in creating all the sub-arrays. Contribution means count of occurence of each element in all sub arrays.
$$
contribution = (n-i)*(i+1)
$$
Here, n is the length of the array.
## 2D Arrays
In a 2-dimensional array **matrix**,\
The number of rows = matrix.length\
The number of columns = matrix[index].length


