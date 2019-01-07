package io;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Test1 {
    static String str = "������";




    public static void main(String[] args) {

        
        try {
            String str2 = new String(str.getBytes("gbk"), "utf-8");
            System.out.println(str2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


}
