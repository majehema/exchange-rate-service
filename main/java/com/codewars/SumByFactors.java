/*      Given an array of positive or negative integers

        I= [i1,..,in]

        you have to produce a sorted array P of the form

        [ [p, sum of all ij of I for which p is a prime factor (p positive) of ij] ...]

        P will be sorted by increasing order of the prime numbers. The final result has to be given as a string in Java, C#, C, C++ and as an array of arrays in other languages.

        Example:

        I = {12, 15}; // result = "(2 12)(3 27)(5 15)"
        [2, 3, 5] is the list of all prime factors of the elements of I, hence the result.

        Notes:

        It can happen that a sum is 0 if some numbers are negative!
        Example: I = [15, 30, -45] 5 divides 15, 30 and (-45) so 5 appears in the result, the sum of the numbers for which 5 is a factor is 0 so we have [5, 0] in the result amongst others.

        In Fortran - as in any other language - the returned string is not permitted to contain any redundant trailing whitespace: you can use dynamically allocated character strings.*/

package com.codewars;

import java.util.HashMap;
import java.util.Map;

public class SumByFactors {
    static HashMap<Integer, Integer> primes = new HashMap<>();
    
    public static String sumOfDivided(int[] l) {
        String text = "";
        
        for (int number : l){
            for (int n= 2; n <= Math.abs(number/2); n++ ){
                addPrime(n, number);
            }
            addPrime(number, number);
        }
        return primes.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByKey())
            .map((temp) -> "(" + temp.getKey() + " " + temp.getValue() + ")")
            .reduce(text, String::concat);

    }
    
    public static boolean isPrime(int n){
        Boolean isPrime = true;
        int count = 2;
        while ((isPrime) && (count < n)){                    
            if (n % count == 0){
                isPrime = false;
            }
            count++;
        }
        return isPrime;
    }
    
    public static void addPrime(Integer n, Integer number){
        if (isPrime(Math.abs(n)) && number%n==0){
            if (primes.containsKey(Math.abs(n))){
                primes.replace(Math.abs(n), primes.get(Math.abs(n))+number);
            } else {
                primes.put(Math.abs(n), number);
            }
        }

    }
}

/*
public class SumOfDivided2 {
  public static String sumOfDivided(int[] l) {
        boolean isPrime;
        int count;
        String text = "";
        HashMap<Integer, Integer> primes = new HashMap<>();
        
        for (int number : l){
            for (int n= 2; n <= Math.abs(number); n++ ){
                isPrime = true;
                count = 2;
            
                while ((isPrime) && (count < n)){                    
                    if (n % count == 0){
                        isPrime = false;
                    }
                    count++;
                }
                if (isPrime && number%count==0){
                    if (primes.containsKey(count)){
                        primes.replace(count, primes.get(count)+number);
                    } else {
                        primes.put(count, number);
                    }
                }
            }
        }

        return primes.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByKey())
            .map((temp) -> "(" + temp.getKey() + " " + temp.getValue() + ")")
            .reduce(text, String::concat); 

  }
}
*/