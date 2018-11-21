package com.dkey.util;

public class HandTransliterator {

    public static String toTranslit(String src) {
        String [] f = {"A","B","C","E","H","I","K","M","O","P","T","X"};
        String [] t = {"А","В","С","Е","Н","І","К","М","О","Р","Т","Х"};

        String res = "";

        for (int i = 0; i < src.length(); ++i) {
            String add = src.substring(i, i + 1);
            for (int j = 0; j < f.length; j++) {
                if (f[j].equals(add)) {
                    add = t[j];
                    break;
                }
            }
            res += add;
        }

        return res;
    }
}