package com.iuminov.easy;

public class _771JewelsandStones {

    public int numJewelsInStones(String J, String S) {
        boolean[] b = new boolean[128];
        for (int i = 0; i < J.length(); i++) {
            int ch = (int) J.charAt(i);
            b[ch] = true;
        }

        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            int j = (int) S.charAt(i);
            result += b[j] ? 1 : 0;
        }
        return result;
    }
}
