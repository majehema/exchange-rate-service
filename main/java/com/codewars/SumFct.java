/*
The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. 
It's easy to see that the sum of the perimeters of these squares is : 
4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80

Could you give the sum of the perimeters of all the squares in a rectangle 
when there are n + 1 squares disposed in the same manner as in the drawing:
 _______________________________________________
|                   |                           |
|                   |                           |
|                   |                           |
|         5         |                           |
|                   |                           |
|                   |            8              |
|___________________|                           |
| 1 | 1 |           |                           |
|___|___|           |                           |
|       |     3     |                           |
|   2   |           |                           |
|_______|___________|___________________________|



Hint:
See Fibonacci sequence

Ref:
http://oeis.org/A000045

The function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n) and returns the total perimeter of all the squares.

perimeter(5)  should return 80
perimeter(7)  should return 216

*/
package com.codewars;

import java.math.BigInteger;

public class SumFct {
    
    public static BigInteger perimeter(BigInteger n) {
        BigInteger first, second = BigInteger.ONE, aux = BigInteger.TWO, sum = BigInteger.TWO;
        for (int i = 2; i <= n.intValue(); i++) {
            first = second;
            second = aux;
            aux = first.add(second);
            sum = sum.add(second);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }
}