package com.hashinclude.june.twenty.four;

/**
 * @author pushpanjay.kumar created on 4/6/20
 */
public class Driver {
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(s);
        Solution sl = new Solution();
        sl.reverseString(s);
        System.out.println(s);
    }
}
