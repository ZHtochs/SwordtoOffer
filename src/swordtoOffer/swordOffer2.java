package swordtoOffer;

public class swordOffer2 {
    public String replaceSpace(StringBuffer str) {
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=' ') {
                sb.append(str.charAt(i));
            }
            else{
                sb.append('%');
                sb.append('2');
                sb.append('0');
            }
        }
        return sb.toString();
    }
}
