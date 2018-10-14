package swordtoOffer.question50_59;

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 *
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-11 20:41
 **/
public class isNumeric_53 {
    public boolean isNumeric(char[] str) {
//        //第二位必须是数字
//        if (!isNumber(str[1])){
//            return false;
//        }
//        //第一位只能是+、-或者数字
//        if (!(isNumber(str[0]) || str[0]=='+' ||str[0]=='-')) {
//            return false;
//        }
return true;

    }
//    //判断一个无符号字符数组是否属数字（包括小数）
//    private boolean isDecimal(char[] chars,int start,int end){
//
//    }
//    //判断一个无符号字符数组是否属数字（不包括小数）
//    private boolean isNumber(char[] chars,int start,int end){
//        for (int i = start; i <=end ; i++) {
//            if (!isNumber(chars[i]))
//                return false;
//        }
//        return true;
//    }
//    //判断某一位是否为数字
//    private boolean isNumber(char c) {
//        if (c == '0' || c == '1' || c == '2' || c == '3' ||
//            c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
//            return true;
//        } else
//            return false;
//    }
public static void main(String[] args) {
        char[] c={'1','2','3'};
        String z=new String(c);
    String s="100";
    StringBuilder stringBuilder=new StringBuilder(s);
    String format="[+-]?[0-9]*((\\.)[0-9]+)?([eE][+-]?[0-9]+)?";
    System.out.println(s.matches(format));

    }
}