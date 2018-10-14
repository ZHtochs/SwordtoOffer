package swordtoOffer.question40_49;

/**约瑟夫环问题
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-09 22:55
 **/
public class LastRemaining_46 {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0 || m == 0)
            return -1;
        int count=0;
        for (int i = 2; i <=n ; i++) {
            count=(count+m)%i;
        }
        return count;
    }
}