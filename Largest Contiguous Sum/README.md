A subarray is a part of an array including one or more contiguous/adjacent elements.


Example

Array: [1, 2, 3, 4, 5]

Subarrays:

[1]

[2]

[3]

[4]

[5]

[1, 2]

[2, 3]

[3, 4]

[4, 5]

[1, 2, 3]

[2, 3, 4]

[3, 4, 5]

[1, 2, 3, 4]

[2, 3, 4, 5]

[1, 2, 3, 4, 5]

If we find the sum of the elements of any subarray then that sum will be known as a contiguous sum.


Example

[1] => 1

[2] => 2

[3] => 3

[4] => 4

[5] => 5

[1, 2] => 3

[2, 3] => 5

[3, 4] => 7

[4, 5] => 9

[1, 2, 3] => 6

[2, 3, 4] => 9

[3, 4, 5] => 12

[1, 2, 3, 4] => 10

[2, 3, 4, 5] => 14

[1, 2, 3, 4, 5] => 15

You are given an array of numbers (could be -ve as well). You need to find the largest contiguous sum from the array.


In the above example, the largest contiguous sum would be 15.


Example

Array: [4 -6 2 5]

Answer: 7

