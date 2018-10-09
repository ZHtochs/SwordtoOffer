package swordtoOffer;

import java.util.LinkedList;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-09 21:00
 **/
public class LeftRotateString_43 {
    public String LeftRotateString(String str, int n) {
        if (str.length()==0)
            return str;
        String s=str+str;
        int n1=n%str.length();
        return s.substring(n,n+str.length());
    }


}