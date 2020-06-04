package com.hashinclude.june.twenty.four;

/**
 * @author pushpanjay.kumar created on 4/6/20
 */
public class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i=0;i<n/2;i++){
            char t = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = t;
        }
    }
}
