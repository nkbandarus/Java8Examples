package com.practice.counter;

public class LengthOfShortestSubString {

    static int subStingLength(String s, String a) {
        // count array for string 2
        int[] count = new int[256];
        //
        int[] substr = new int[256];
        // boolean array to check if element is present in substring or not
        boolean[] str2 = new boolean[256];
        // i is initial pointer
        // j is last pointer
        // m is the required minimum length
        int i = 0, j = 0, m = 0, sum = a.length();
        // update array count[] and str2[]
        for (i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
            str2[a.charAt(i)] = true;
        }
        i = 0;
        // move i till we dont find first element of substring in the given
        // string
        while (str2[s.charAt(i)] != true) {
            i++;
        }
        // i--;
        j = i;
        // find first window which contains substring
        while (sum != 0 && j < s.length()) {
            if (count[s.charAt(j)] != 0) {
                sum--;
                count[s.charAt(j)]--;
            }
            if (str2[s.charAt(j)]) {
                substr[s.charAt(j)]++;
            }
            if (sum == 0) {
                break;
            }
            j++;

        }
        if (j == s.length()) {
            return 0;
        }
        m = j - i + 1;
        // again update array count[] and str2[]
        for (int k = 0; k < a.length(); k++) {
            count[a.charAt(k)]++;
            str2[a.charAt(k)] = true;
        }
        // System.out.println(s.substring(i,m+i));
        j++;
        // loop for checking minimum length
        while (j < s.length()) {

            if (str2[s.charAt(j)]) {
                substr[s.charAt(j)]++;
            }
            if (s.charAt(j) == s.charAt(i)) {
                substr[s.charAt(i)]--;
                i++;
                while (str2[s.charAt(i)] != true || substr[s.charAt(i)] > count[s.charAt(i)]) {

                    if (str2[s.charAt(i)]) {
                        substr[s.charAt(i)]--;
                    }
                    i++;
                }

            }
            if (j - i + 1 < m) {
                m = j - i + 1;
            }
            j++;

        }
        // System.out.println(s.substring(i,m+i));
        return m;

    }

    public static void main(String[] args) {
        System.out.println(subStingLength("this is a test string", "tist"));
    }

}