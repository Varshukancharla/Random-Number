package com.example.lib;

import java.util.Locale;

public class MyClass {
    public static void main(String args[]) {



        String str = "Today we are GoinG to try AndroidDevelopment at Gayatri vidya Parishad college ";
        System.out.println(str);
        char[] st= str.toCharArray();

        for(int i=0;i<str.length();i++){


                if( Character.isUpperCase(st[i]) ){

                    st[i] = Character.toLowerCase( st[i] );

                }else if(Character.isLowerCase(st[i]) ){

                    st[i] = Character.toUpperCase( st[i] );
                }
            }
        str = new String(st);

        System.out.println(str);
    }
}