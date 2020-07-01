package com.hans.codeinginterview;

public class CompressString {
    public static void main(String[] args) {
        String str = "aabbbcccccaa"; // result is "a2b3c5c2"
        System.out.println(compress(str));
    }

    public static String compress(String str) {
        StringBuffer compressedStr = new StringBuffer();
        for (int i = 0 ; i < str.length()-1 ; i++) {
            char current = str.charAt(i);
            int count = 0;

            for (int j = i ; j < str.length() ; j++) {
                if (current == str.charAt(j)) {
                    count++;
                } else {
                    i = j-1;
                    break;
                }
            }

            compressedStr.append(current).append(count);
        }

        if (str.length() <= compressedStr.toString().length()) {
            return str;
        }

        return compressedStr.toString();
    }
}