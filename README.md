Array-and-String-Character-Combination-with-Binary-Numbers-using-Java
=================================================

This program is capable to combine elements of an array and characters of a String and return the array containing each combination. User can choose to get all the results or shorten down to the number of Objects, array elements or characters in this case, in their result.
```
The combination is done using the binary numbers.
Example:
Let's see how we can combine 3 items A, B, and C.

We have 3 items, So the possible combination will be 2^3 - 1 = 7

    A   B   C   Combination
1   0   0   1       C       
2   0   1   0       B
3   0   1   1       BC
4   1   0   0       A
5   1   0   1       AC
6   1   1   0       AB
7   1   1   1       ABC

In the above table, we take 'C' for first row because 1 is present in Column for C. Similarly, we take BC in the third column because B and C has 1's in it, and so on.

This is pretty much how the algorith works.
```
