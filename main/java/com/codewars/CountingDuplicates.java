/*
 *  Write a function that will return the count of distinct case-insensitive 
    alphabetic characters and numeric digits that occur more than once in the 
    input string. The input string can be assumed to contain only alphabets 
    (both uppercase and lowercase) and numeric digits.

    Example
    "abcde" -> 0 # no characters repeats more than once
    "aabbcde" -> 2 # 'a' and 'b'
    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    "indivisibility" -> 1 # 'i' occurs six times
    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    "aA11" -> 2 # 'a' and '1'
    "ABBA" -> 2 # 'A' and 'B' each occur twice
 */
package com.codewars;

/**
 *
 * @author mary_
 */
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int ans = 0;
        text = text.toLowerCase();
        while (text.length() > 0) {
            String firstLetter = text.substring(0,1);
            text = text.substring(1);
            if (text.contains(firstLetter)) ans ++;
            text = text.replace(firstLetter, "");
        }
        return ans;
    }

    public static int duplicateCount2(String text) {
        Set<String> count = new HashSet<>();

        for (String string : text.toLowerCase().split("")) {
            if (text.toLowerCase().indexOf(string) != text.toLowerCase().lastIndexOf(string)){
                count.add(string);
            }
        }

        return count.size();
    }

    public static int duplicateCount3(String text) {
        return (int)text
                .toLowerCase()
                .chars()
                .boxed()
                .collect(Collectors.groupingBy(k->k,Collectors.counting()))
                .values()
                .stream()
                .filter(e->e>1)
                .count();
    }
}