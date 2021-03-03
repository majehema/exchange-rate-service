/*
A format for expressing an ordered list of integers is to use a comma separated 
list of either individual integers or a range of integers denoted by the starting 
integer separated from the end integer in the range by a dash, '-'. 
The range includes all integers in the interval including both endpoints. 
It is not considered a range unless it spans at least 3 numbers. For example "12,13,15-17"
Complete the solution so that it takes a list of integers in increasing order 
and returns a correctly formatted string in the range format.

Example:

Solution.rangeExtraction(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
# returns "-6,-3-1,3-5,7-11,14,15,17-20"
*/
package com.codewars;

/**
 *
 * @author mary_
 */
public class RangeExtraction {
    
    public static void main(String[] args) {
        int[] arr = new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}; //-6,-3-1,3-5,7-11,14,15,17-20
        System.out.println(rangeExtraction(arr));
    }
    
    public static String rangeExtraction(int[] arr) {
        String text = "";
        int init = 0;
        for (int i=0; i<arr.length; i++){
            if (i==arr.length-1 || arr[i+1]!= arr[i]+1){
                if (i-init > 1){
                    text += arr[init] + "-";
                } else if (i-init == 1){
                    text += arr[init] + ",";
                }
                text += arr[i]+ ",";
                
                if (i<arr.length-1){
                    init = i+1;
                }
            }
        }
        return text.substring(0,text.length()-1);
    }
    
}
