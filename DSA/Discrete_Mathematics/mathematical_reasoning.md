# Discrete Mathematics
**Discrete mathematics is the study of mathematical structures that are discrete in the sense that they assume only distinct, separate values, rather than in a range of values.** 

It deals with the mathematical objects that are widely used in all most all fields of computer science, such as programming languages, data structures and algorithms, cryptography, operating systems, compilers, computer networks, artificial intelligence, image processing, computer vision, natural language processing, etc. The subject enables the students to formulate problems precisely, solve the problems, apply formal proof techniques and explain their reasoning clearly.

----------
## Mathematical Reasoning
**Logic is Science of reasoning**
## GCD
```java
public int gcd(int A, int B) {
//euclidean algorithm: it states that gcd of two number would not change if one of the number is subracted from the other.
    if(A == 0) return B;
    if(B == 0) return A;

    if(A == B) return A;

    if(A > B)
        return gcd(A-B, B);
    else
        return gcd(A, B-A);
}
```
## Square root of a number
Square root for a number can be found in three ways
1. Factorisation
2. Long division
3. Pythagorean triplet

In squares of Integers
0, 1, 2 ,3 , 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16 ... is
0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, ...

Observe the last digit of all the squares they form a series of the following form:
0, 1, 4, 6, 9, 6, 5, 6, 9, 4, 1

Thus, if a number with last digit 2, 3, 7, 8 can be instantly ruled out as an imperfect square.

## Ratio and proportion
Ratio a:b gives the relation between two numbers/ quantities, Here a is called antecedent and b is called consequent.

Proportion is the equality of two ratios a:b, c:d is a:b::c:d. Here b, d are called means and a, c are c
## Modular Arithemetic
The branch of mathematics dealing with mod(%) operations on numbers.
### Modular Addiition/Subraction
$(A + B) \% M = ((A \% M) + (B \% M)) \% M$

### Modular Multiplication
$(A * B) \% M = ((A \% M) * (B \% M)) \% M$

### inverse modulo
If $(a * b) \% m = 1$ then b is called inverse modulo of a.

$( b<sup>-1</sup> ) \% m will exist only if gcd(b, m) = 1$


### Modular Exponentiation
$A <sup>B</sup> \% M = {1 -> if n = 0 ((A<sup>B/2</sup>) * (A<sup>B/2</sup>)) \% M -> if n is even
}$

#### Fermat's little theorem
This theorem states that if p is a prime number then $A<sup>(p-1)</sup> \% P = 1$

[Knowledge source](https://www.geeksforgeeks.org/modular-arithmetic/)
## Combinatorics

