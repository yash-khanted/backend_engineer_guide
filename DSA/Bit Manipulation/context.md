# Bit Manipulation
Bitwise operators - &, |, ^, >>, <<, ~\
These operations are commutative

## properties
Let, there be a number a,\
### bitwise and (&)
Here, if any one bit is unset then we get unset bit
- a & 1 = 1     if the a is odd
- a & 1 = 0     if the a is even
- a & a = a
- a & 0 = 0

### bitwise or (|)
Here, if both bits are unset then we get unset bit
- a | a = a
- a | 0 = a
- a | 1 = 1     for all numbers

### bitwise xor (^)
Here, if two bits are similar then we get unset bit
- a ^ a = 0
- a ^ 0 = a
can be used to check if a bit is set or unset at any position

### bitwise negation (~)
This operation switch the bit from set to unset or vice-versa

### Left shift operator / Bit appendation
In this operation (a << i), every bit moves i times to the left thus doubling the number as a result.
$$ a<<i = a*2^i $$

### Right shift operator / Bit Discardation
In this operation (a >> i), every bit moves i times to the right thus halving the number i times
$$ a>>i = a/2^i$$
