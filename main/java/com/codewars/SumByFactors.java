/*  Given an array of positive or negative integers

    I= [i1,..,in]

    you have to produce a sorted array P of the form

    [ [p, sum of all ij of I for which p is a prime factor (p positive) 
    of ij] ...]

    P will be sorted by increasing order of the prime numbers. 
    The final result has to be given as a string in Java, C#, C, C++ 
    and as an array of arrays in other languages.

    Example:

    I = {12, 15}; // result = "(2 12)(3 27)(5 15)"
    [2, 3, 5] is the list of all prime factors of the elements of I, 
    hence the result.

    Notes:

    It can happen that a sum is 0 if some numbers are negative!
    Example: I = [15, 30, -45] 5 divides 15, 30 and (-45) so 5 appears in the 
    result, the sum of the numbers for which 5 is a factor is 0 so we have 
    [5, 0] in the result amongst others.

    https://www.codewars.com/kata/54d496788776e49e6b00052f/train/java
    */

package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumByFactors {
    static HashMap<Integer, Integer> primes;
    static ArrayList<Integer> primesList;
    
    public static void main(String[] args) {
        int[] lst = new int[] {12, 15};
        System.out.println(SumByFactors.sumOfDivided(lst));
    }
    
    public static String sumOfDivided(int[] l) {
        primes = new HashMap<>();
        primesList = new ArrayList();
        String text = "";
        
        createPrimesList(l);
        
        for (int number : l){
            addPrime(2, number);
            for (int n = 3; n <= Math.abs(number/2); n+=2 ){
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

    public static void createPrimesList(int[] l){
        int maxNumber;
        
        Arrays.sort(l);
        maxNumber = (Math.abs(l[l.length-1]) > Math.abs(l[0]) ? Math.abs(l[l.length-1]) : Math.abs(l[0]));
        
        if (maxNumber>1){
            primesList.add(2);
        }
        for (int n = 3; n <= Math.abs(maxNumber); n+=2 ){
            if (isPrime(n)){
                primesList.add(n);
            }
        }
    }
        
    public static boolean isPrime(int n){
        for(int i=3; i<=Math.sqrt(n); i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    public static void addPrime(Integer n, Integer number){
        if (primesList.contains(Math.abs(n)) && number%n==0){
            if (primes.containsKey(Math.abs(n))){
                primes.replace(Math.abs(n), primes.get(Math.abs(n))+number);
            } else {
                primes.put(Math.abs(n), number);
            }
        }
    }
}
