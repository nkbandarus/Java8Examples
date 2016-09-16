package com.practice.ds;

public class CountPossibleEncodings {
    public static int countEncodingsRecursive(String digits) {
        int strLen = digits.length();
        if (strLen == 1 || strLen == 0)
            return 1;

        int total = 0;
        if (isValidNumber(digits))
            total += 1;

        total += countEncodingsRecursive(digits.substring(1));
        if (strLen > 2) {
            String prefix = digits.substring(0, 2);
            String remain = digits.substring(2);
            if (isValidNumber(prefix))
                total += countEncodingsRecursive(remain);
        }
        return total;
    }

    protected static boolean isValidNumber(String str) {
        int val = Integer.valueOf(str);
        return (val >= 0) && (val <= 26);
    }

    public static void main(String[] args) {
        System.out.println(CountPossibleEncodings.countEncodingsRecursive("111111"));
    }

}