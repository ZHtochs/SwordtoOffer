package swordtoOffer;

public class swordtoOffer1 {


    public boolean Find(int target, int[][] array){
        int rows= array.length;
        int cols=array[0].length;
        int i=rows-1,j=0;
        while( i>0 &&  j<cols){
            if(array[i][j]>target){
                i--;
            }
            if(array[i][j]<target){
                j++;
            }
            if(array[i][j]==target)
                return true;
        }
            return false;
    }
}
