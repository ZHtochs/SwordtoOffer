package swordtoOffer;

import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-07 23:37
 **/
public class FirstNotRepeatingChar_34 {
    public int FirstNotRepeatingChar(String str) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for (int i = 0; i <str.length() ; i++) {

            if(map.containsKey(str.charAt(i))){
                int time=map.get(str.charAt(i));
                time++;
                map.put(str.charAt(i),time);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       FirstNotRepeatingChar_34 f=new FirstNotRepeatingChar_34();
        System.out.println(f.FirstNotRepeatingChar("google"));;
    }
}