/***
 
 In this challenge, you are required to calculate
 and print the sum of the elements in an array, 
 keeping in mind that some of those integers may 
 be quite large.


Function Description

Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.

aVeryBigSum has the following parameter(s):

- int ar[n]: an array of integers .

Return

- long: the sum of all the elements in an array

Input Format

The first line of input consist of an integer n.
The next line contains n space integers in an array.

Output Format

Return the integer sum of the element in the arrray

Constraints:

1 <= n <= 10
0 <= ar[i]<= 10^10

Sample Input

5
1000000001 1000000002 1000000003 1000000004 1000000005

Sample Output
5000000015


***/


var ar = [1000000001, 1000000002, 1000000003, 1000000004, 1000000005]
var count = 0;

const calculateSum = (ar) => {
    for (let i = 0; i < Object.keys(ar).length; i++) {
        count += ar[i]
    }
    return count;
}

console.log(calculateSum(ar));

