package swordtoOffer;

/**输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @program: sort
 * @author: zhuhe
 * @create: 2018-10-06 15:08
 **/
public class VerifySquenceOfBST_23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        int count=sequence.length;
        if(count==0)
            return false;
        return isRight(sequence,0,count-1);
    }
    public boolean isRight(int[] sequence,int start,int end){
        if(start>=end) return true;
        int i=end-1;
        while(sequence[i]>sequence[end]&&i>start) i--;
        for(int j=start;j<i;j++){
            if(sequence[j]>sequence[end])
                return false;
        }
        return isRight(sequence,start,i)&&isRight(sequence,i+1,end-1);

    }

}