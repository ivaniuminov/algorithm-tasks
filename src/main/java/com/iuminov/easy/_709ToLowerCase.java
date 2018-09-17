package com.iuminov.easy;

public class _709ToLowerCase {

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for(int i = 0; i < str.length(); i++) {
            if (chars[i] < 90 && chars[i] > 64) {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
