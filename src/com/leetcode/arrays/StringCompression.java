package com.leetcode.arrays;

public class StringCompression {

    public static void main(String[] args) {
        char[] sample = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(sample));
    }

    public static int compress(char[] chars) {

        int lastAscii = Integer.valueOf(chars[0]);
        int count = 1;

        StringBuffer str = new StringBuffer(String.valueOf(chars[0]));
        str.append(chars[0]);

        for (int i = 1; i < chars.length; i++) {

            int currAscii = Integer.valueOf(chars[i]);

            if (lastAscii == currAscii) {
                count++;
            } else {
                if (count > 1) {
                    str.append(count);
                }

                lastAscii = currAscii;
                count = 1;
                str.append(chars[i]);
            }
        }

        if (count > 1) {
            str.append(count);
        }


        char [] compressed = str.toString().toCharArray();

        for(int j=0;j<compressed.length;j++){
            chars[j]=compressed[j];
        }

       System.out.println(chars);
        return str.length();
    }
}